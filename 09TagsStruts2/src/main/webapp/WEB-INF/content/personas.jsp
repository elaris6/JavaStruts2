<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- Se agrega la librería para poder usar Struts2 en la JSP -->
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Formulario Personas</title>
        <s:head/>
    </head>
    <body>
        <h1>Formulario Personas</h1>
        <s:form>
            <!-- Mediante OGNL de Struts2, al invocar a "persona.nombre" desde una
            etiqueta de tipo "textfield", el framework está internamente invocando
            al método "setNombre()" de la clase "Persona". -->
            <s:textfield label="Nombre" name="persona.nombre"/>
            <!-- De forma análoga al campo anterior, para acceder a una clase interna,
            deberemos acceder mediante la nomenclatura del punto al atributo deseado.-->
            <s:textfield label="Calle" name="persona.domicilio.calle"/>
            <s:textfield label="Num. Calle" name="persona.domicilio.numCalle"/>
            <s:textfield label="Ciudad" name="persona.domicilio.ciudad"/>
            <s:submit value="Enviar" />
        </s:form>

        <h3>Valores proporcionados:</h3>    

        <!-- Mediante OGNL de Struts2, al invocar a "persona.nombre" desde una
            etiqueta de tipo "property", el framework está internamente invocando
            al método "getNombre()" de la clase "Persona".  -->
        Nombre: <s:property value="persona.nombre"/><br/>
        Calle: <s:property value="persona.domicilio.calle"/><br/>
        Num. Calle: <s:property value="persona.domicilio.numCalle"/><br/>
        Ciudad: <s:property value="persona.domicilio.ciudad"/><br/><br/>

        <!-- Ejemplos adicionales de tags de Struts2 -->

        <s:if test="persona.nombre != null">
            <s:if test="persona.nombre == 'Israel'">
                El nombre corresponde a una persona GUAY
            </s:if>
            <s:else>
                El nombre podría NO pertenecer a una persona guay...
            </s:else>
        </s:if>

        <br/><br/>
        <a href="index.html">Volver al inicio</a>
    </body>
</html>
