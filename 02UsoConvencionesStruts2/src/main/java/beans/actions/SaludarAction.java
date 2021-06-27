package beans.actions;

import org.apache.logging.log4j.*;

/* Clase de tipo Action de Struts 2. Es una clase normal, que debe implementar
un método "execute", que será ejecutado de manera automática. */
public class SaludarAction {

    // Se inicializa la instancia de "Logger" para escribir el log
    Logger log = LogManager.getLogger(SaludarAction.class);
    
    private String saludosAtribute;
    
    /* En el método "execute", si se usan convenciones, ya no es necesario devolver
    un string que se configure en el fichero "struts.xml", pues esta gestión será
    hecha de manera automática.
    Sin embargo, será necesario seguir devolviendo un String cualquiera, que se 
    puede tomar de las constantes de la interfaz "Action", si es implementada. */
    public String execute(){
        log.info("Ejecutando método execute desde Struts2");
        this.saludosAtribute = "Saludos desde Struts2 con Convenciones! Valor en Atributo";
        return "exito"; 
    }

    public String getSaludosAtribute() {
        return saludosAtribute;
    }

    public void setSaludosAtribute(String saludosAtribute) {
        this.saludosAtribute = saludosAtribute;
    }
    
    
    
}
