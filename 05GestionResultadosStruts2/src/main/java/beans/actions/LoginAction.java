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
        if(this.usuario.equals("admin")){
            if(this.password.equals("admin")){
                return SUCCESS; // equivale al String "success"
            } else return INPUT; // equivale al String "input"
        } else return INPUT;
        

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
