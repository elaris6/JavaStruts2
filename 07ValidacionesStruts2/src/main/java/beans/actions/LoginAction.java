package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/* En este caso la clase de tipo Action, se hace heredar de la clase "ActionSupport",
que a su vez implementa la interfaz "Action" y otras clases útiles para gestión de
formularios, textos y properties. */
/* Se incluye la anotación "Result" para sistituir la acción del fichero "struts.xml"
que se encarga de hacer la redirección de la acción "login" al JSP "login.jsp".
Dejamos esta clase simplemente como redireccionadora. */
@Result(name="success", location="/WEB-INF/content/login.jsp")
public class LoginAction extends ActionSupport {

    // Se inicializa la instancia de "Logger" para escribir el log
    Logger log = LogManager.getLogger(LoginAction.class);
    
    /* Se hace la redirección simplemente incluyendo el método "execute", que
    siempre devolverá "SUCCESS" sin realizar ninguna validación.
    Para sustituir la entrada correspondiente del fichero "struts.xml", se incluye
    la anotación "Action". */
    @Action("login")
    public String exectue(){
        
        log.info("Se ejecuta redirección a JSP login.");
        return SUCCESS;// equivale al String "success"
    }

}
