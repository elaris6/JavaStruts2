package es.local.personal.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;

/* Se definen varias acciones que serán gestionadas desde la acción
"LinkAction", y que actuarán como "redirección", haciendo que se carge
la parte de la plantilla de tiles que corresponda, según se ha definido
en el fichero "tiles.xml". */
@Results({
    @Result(name="bienvenidoResult",location="bienvenidoTile", type="tiles"),
    @Result(name="personasResult", location="personasTile", type="tiles")
})
public class LinkAction extends ActionSupport{
    
    @Action(value="bienvenidoAction")
    public String bienvenido(){
        return "bienvenidoResult";
    }
    
    @Action(value="personasAction")
    public String personas(){
        return "personasResult";
    }
    
}
