package beans.actions;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

/* Para definir los resultados sustituyendo al fichero "struts.xml", se incluye la
anotación "Results", que a su vez incluye varias anotaciones de tipo "Result", que
especifican la acción a realizar en función de cada resultado esperado, al igual
que se indica en el fichero "struts.xml". */
@Results({
    @Result(name="success", location="/WEB-INF/content/bienvenido.jsp"),
    @Result(name="input", location="login", type="redirectAction")})
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

        if (this.usuario != null) {
            if (this.usuario.equals("admin")) {
                if (this.password.equals("admin")) {
                    return SUCCESS; // equivale al String "success"
                } else {
                    return INPUT; // equivale al String "input"
                }
            } else {
                return INPUT;
            }
        }
        return INPUT;

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
