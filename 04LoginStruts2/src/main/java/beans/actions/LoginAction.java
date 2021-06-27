package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

/* En este caso la clase de tipo Action, se hace heredar de la clase "ActionSupport",
que a su vez implementa la interfaz "Action" y otras clases útiles para gestión de
formularios, textos y properties. */
public class LoginAction extends ActionSupport {

    // Se inicializa la instancia de "Logger" para escribir el log
    Logger log = LogManager.getLogger(LoginAction.class);

    private String usuario;
    private String password;

    /*  */
    public String execute() {
        log.info("Usuario: " + this.usuario);
        log.info("Password: " + this.password);
        /* Al extender de "ActionSupport" que implementa "Action", se pueden usar
        las constantes definidas en esta interfaz, como retorno de la acción. */

        return SUCCESS;
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

    

    /* Se definen métodos getter para recuperar los valores del fichero properties
    usando el método heredado "getText" de la clase "ActionSupport".
    Se debe referenciar al nombre de la propiedad en el fichero. */
    public String getTitulo() {

        return getText("form.titulo");
    }

    public String getUsuarioLabel() {

        return getText("form.usuario.label");
    }
    
    public String getPasswordLabel() {

        return getText("form.password.label");
    }

    public String getBoton() {

        return getText("form.boton");
    }
    
    public String getSubtitulo(){
        
        return getText("form.subtitulo");
    }
}
