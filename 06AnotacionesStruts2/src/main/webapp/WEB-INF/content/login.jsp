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
        <!-- Se puede acceder directamente a la propertie con el uso de la función
        "s:text", indicando en "name" el nombre de la propuedad. Así se evita tener
        que definir los métodos pertinentes en la clase Action. -->
        <h1><s:text name="form.titulo"/></h1>
        
        <s:form action="validarUsuario">
            <s:textfield key="form.usuario.label" name="usuario" />
            <br/>
            <s:password key="form.password.label" name="password" />
            <!-- También se puede acceder directamente a una propertie, mediante
            el atributo "key" de la librería Struts. -->
            <s:submit name="submit" key="form.boton" />
        </s:form>
        

        <br/>
        <a href="index.html"><s:text name="form.volver" /></a>
    </body>
</html>
