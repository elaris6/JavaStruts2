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
        <h1>Personas con Struts2</h1>
        
        <s:form>
            <s:textfield name="nombre" />
            <s:submit value="Enviar" />
        </s:form>
        
        <div>
            Nombre proporcionado: <s:property value="nombre" />
        </div>
    </body>
</html>
