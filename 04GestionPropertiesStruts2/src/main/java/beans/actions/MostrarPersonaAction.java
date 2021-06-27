package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

/* En este caso la clase de tipo Action, se hace heredar de la clase "ActionSupport",
que a su vez implementa la interfaz "Action" y otras clases útiles para gestión de
formularios, textos y properties. */
public class MostrarPersonaAction extends ActionSupport {

    // Se inicializa la instancia de "Logger" para escribir el log
    Logger log = LogManager.getLogger(MostrarPersonaAction.class);

    private String nombre;

    /*  */
    public String execute() {
        log.info("El nombre es: " + nombre);
        /* Al extender de "ActionSupport" que implementa "Action", se pueden usar
        las constantes definidas en esta interfaz, como retorno de la acción. */
        if (nombre != null) {
            nombre = nombre + ". Saludos!!!";
        }
        return SUCCESS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /* Se definen métodos getter para recuperar los valores del fichero properties
    usando el método heredado "getText" de la clase "ActionSupport".
    Se debe referenciar al nombre de la propiedad en el fichero. */
    public String getTitulo() {

        return getText("persona.titulo");
    }

    public String getValor() {

        return getText("persona.valor");
    }

    public String getBoton() {

        return getText("persona.boton");
    }
}
