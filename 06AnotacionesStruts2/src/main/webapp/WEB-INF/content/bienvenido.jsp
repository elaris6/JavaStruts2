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
        <h1><s:text name="bienvenido.titulo"/></h1>
        <br/>
        <h3><s:text name="bienvenido.mensaje"/></h3>
        <br/>
        <s:text name="bienvenido.usuario.label" />: <s:property value="usuario" />
        <br/>
        <s:text name="bienvenido.password.label" />: <s:property value="password" />
        <br/>
        <br/>
        <!-- En el enlace se puede especificar el atributo "url" de struts2, para
        indicar un nombre de acción que realizar. -->
        <a href="<s:url action="login"/>"><s:text name="bienvenido.volver" /></a>
    </body>
</html>
