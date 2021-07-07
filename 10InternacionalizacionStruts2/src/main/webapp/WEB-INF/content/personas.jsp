<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- Se agrega la librería para poder usar Struts2 en la JSP -->
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <title><s:text name="form.titulo" /></title>
        <s:head/>
    </head>
    <body>
        <h1><s:text name="form.titulo" /></h1>
        <s:form>
            <!-- Mediante OGNL de Struts2, al invocar a "persona.nombre" desde una
            etiqueta de tipo "textfield", el framework está internamente invocando
            al método "setNombre()" de la clase "Persona". -->
            <s:textfield key="form.nombre" name="persona.nombre"/>
            <!-- De forma análoga al campo anterior, para acceder a una clase interna,
            deberemos acceder mediante la nomenclatura del punto al atributo deseado.-->
            <s:textfield key="form.calle" name="persona.domicilio.calle"/>
            <s:textfield key="form.no.calle" name="persona.domicilio.numCalle"/>
            <s:textfield key="form.ciudad" name="persona.domicilio.ciudad"/>
            <s:submit key="form.enviar" />
        </s:form>

        <h3><s:text name="form.resultado"/></h3>    

        <!-- Mediante OGNL de Struts2, al invocar a "persona.nombre" desde una
            etiqueta de tipo "property", el framework está internamente invocando
            al método "getNombre()" de la clase "Persona".  -->
        <s:text name="form.nombre"/> <s:property value="persona.nombre"/><br/>
        <s:text name="form.calle"/> <s:property value="persona.domicilio.calle"/><br/>
        <s:text name="form.no.calle"/> <s:property value="persona.domicilio.numCalle"/><br/>
        <s:text name="form.ciudad"/> <s:property value="persona.domicilio.ciudad"/><br/><br/>

        <!-- Para la configuración de la internacionalización, se hace uso de un
        parámetro ("request_locale") al llamar a la acción, y en ella en función
        de ficho parámetro se cargará el fichero de properties adecuado.
        Esto se hace de forma automática al extender de la clase "ActionSupport",
        no es necesario añadir código adicional. -->
        <s:url var="localeES" action="personas">
            <s:param name="request_locale">es</s:param>
        </s:url>

        <s:url var="localeEN" action="personas">
            <s:param name="request_locale">en</s:param>
        </s:url>

        <s:a href="%{localeES}"><s:text name="form.idioma.espanol"/></s:a>
         | 
        <s:a href="%{localeEN}"><s:text name="form.idioma.ingles"/></s:a>

            <br/><br/>
            <a href="index.html"><s:text name="form.volver"/></a>
    </body>
</html>
