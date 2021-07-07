package es.local.personal.actions;

import com.opensymphony.xwork2.ActionSupport;
import es.local.personal.model.Persona;
import org.apache.logging.log4j.*;

public class PersonasAction extends ActionSupport{
    
    // Se inicializa la instancia para gestionar el logging
    Logger log = LogManager.getLogger(PersonasAction.class);
    
    private Persona persona;
    
    @Override
    public String execute(){
        
        if(this.persona != null){
            log.info("\nPersona: " + persona);
        } else {
            log.info("\nPersona con valor NULL");
        }
        return SUCCESS;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
}
