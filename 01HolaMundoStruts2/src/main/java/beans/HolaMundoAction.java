package beans;

import org.apache.logging.log4j.*;

/* Clase de tipo Action de Struts 2. Es una clase normal, que debe implementar
un método "execute", que será ejecutado de manera automática. */
public class HolaMundoAction {

    // Se inicializa la instancia de "Logger" para escribir el log
    Logger log = LogManager.getLogger(HolaMundoAction.class);
    
    private String saludosAtribute;
    
    /* El método "execute", que deberá devolver el JSP que se va a ejecutar.
    En el archivo "struts.xml" se deberá indicar la correspondencia entre la cadena
    de salida y la página JSP que se debe presentar. */
    public String execute(){
        log.info("Ejecutando método execute desde Struts2");
        this.saludosAtribute = "Saludos desde Struts2. Valor en Atributo";
        return "exito";
    }

    public String getSaludosAtribute() {
        return saludosAtribute;
    }

    public void setSaludosAtribute(String saludosAtribute) {
        this.saludosAtribute = saludosAtribute;
    }
    
    
    
}
