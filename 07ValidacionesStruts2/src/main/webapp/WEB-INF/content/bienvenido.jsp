<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- Se agrega la librería para poder usar Struts2 en la JSP -->
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Struts2</title>
        <!-- Con esta etiqueta se agregan los estilos de Struts2 de forma automática,
        para la gestión de validaciones. -->
        <s:head/>
    </head>
    <body>
        <h1><s:text name="bienvenido.titulo"/></h1>
        <!-- Con esta etiqueta se agregan los estilos de Struts2 de forma automática,
        para permitir mostrar mensajes genéricos (no de error). -->
        <s:actionmessage/>
        <!-- Esta etiqueta sirve para que se muestren los mensajes de error que no
        están asociados a ningún campo concreto.
        Los que están asociados a campos se mostrarían sin tener que añadir nada. -->
        <s:actionerror/>
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
