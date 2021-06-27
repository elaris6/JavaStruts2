<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- Se agrega la librería para poder usar Struts2 en la JSP -->
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Struts2</title>
    </head>
    <body>
        <!-- Se accede al valor de la propertie "persona.titulo", aplicando la 
        metodología de JavaBeans, que ejecuta el método "getTitulo()". -->
        <h1><s:property value="titulo"/></h1>
        
        <s:form>
            <s:textfield key="form.usuario.label" name="usuario" />
            <br/>
            <s:password key="form.password.label" name="password" />
            <!-- También se puede acceder directamente a una propertie, mediante
            el atributo "key" de la librería Struts. -->
            <s:submit name="submit" key="form.boton" />
        </s:form>
        
        <div>
            <!-- Se accede al valor de la propertie "persona.valor", aplicando la 
        metodología de JavaBeans, que ejecuta el método "getValor()". -->
            <h3><s:property value="subtitulo" /></h3>
            <s:property value="usuarioLabel" />
            <s:property value="usuario" />
            <br/>
            <s:property value="passwordLabel" />
            <s:property value="password" />
        </div>
        <br/>
        <a href="index.html">Volver al inicio</a>
    </body>
</html>
