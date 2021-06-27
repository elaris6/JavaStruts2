<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- Se agrega la librería para poder usar Struts2 en la JSP -->
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Struts2</title>
    </head>
    <body>
        <!-- Se accede al valor de la propertie "persona.titulo", aplicando la 
        metodología de JavaBeans, que ejecuta el método "getTitulo()". -->
        <h1><s:property value="titulo"/></h1>
        
        <s:form>
            <s:textfield name="nombre" />
            <!-- También se puede acceder directamente a una propertie, mediante
            el atributo "key" de la librería Struts. -->
            <s:submit name="submit" key="persona.boton" />
        </s:form>
        
        <div>
            <!-- Se accede al valor de la propertie "persona.valor", aplicando la 
        metodología de JavaBeans, que ejecuta el método "getValor()". -->
            <s:property value="valor" /> <s:property value="nombre" />
        </div>
    </body>
</html>
