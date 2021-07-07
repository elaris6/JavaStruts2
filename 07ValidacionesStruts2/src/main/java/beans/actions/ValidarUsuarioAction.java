package beans.actions;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.convention.annotation.*;

/* Para definir los resultados sustituyendo al fichero "struts.xml", se incluye la
anotación "Results", que a su vez incluye varias anotaciones de tipo "Result", que
especifican la acción a realizar en función de cada resultado esperado, al igual
que se indica en el fichero "struts.xml". */
@Results({
    @Result(name = "success", location = "/WEB-INF/content/bienvenido.jsp"),
    @Result(name = "input", location = "/WEB-INF/content/login.jsp")})
/* Para que se muestren los mensajes no se puede hacer un redirect a una acción, pues
se perderían los mensajes de validación enviados. */
    //@Result(name = "input", location = "login", type = "redirectAction")})
public class ValidarUsuarioAction extends ActionSupport {

    // Se inicializa la instancia de "Logger" para escribir el log
    Logger log = LogManager.getLogger(LoginAction.class);

    private String usuario;
    private String password;

    /* Se especifica la anotación "Action", para identificar esta acción con el
    nombre esperado. En este caso "validarUusuario". */
    @Action("validarUsuario")
    public String execute() {
        log.info("Usuario: " + this.usuario);
        log.info("Password: " + this.password);

        if (this.usuario != null && this.usuario.equals("admin")) {
            if (this.password != null && this.password.equals("admin")) {
                /* Al heredar de la clase "ActionSupport" se puede hacer uso de ciertos
                métodos que permiten enviar mensajes al JSP. En este caso, un aviso. */
                addActionMessage(getText("usuario.valido"));
                return SUCCESS; // equivale al String "success"
            } else {
                return INPUT;
            }
        }
        return INPUT;
    }

    /* El método "validate" de la clase "ActionSupport" es el apropiado para incluir las validaciones
    de los campos a realizar en la clase Action. */
    @Override
    public void validate() {

        if (this.usuario == null || this.usuario.trim().equals("")) {
            /* En este caso, un error asociado a un campo concreto, referenciando el nombre del
            campo en el formulario. */
            addFieldError("usuario", getText("val.usuario"));
        } else if (!usuarioValido()) {

            /* EN este caso se envía un mensaje de error no asociado a un campo. */
            addActionError(getText("usuario.invalido"));
        }

        if (this.password == null || this.password.trim().equals("")) {
            addFieldError("password", getText("val.password"));
        } else if (this.password.length() < 3) {

            addFieldError("password", getText("val.password.min.len"));
        }
    }

    private boolean usuarioValido() {

        if (this.usuario.equals("admin")) {
            return true;
        } else {
            return false;
        }
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
