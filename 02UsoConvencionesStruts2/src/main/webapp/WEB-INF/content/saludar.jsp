<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- Se agrega la librería para poder usar Struts2 en la JSP -->
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Saludos desde Struts</title>
    </head>
    <body>
        <!-- Se accede al valor del atribuo de la clase de tipo Action a través
        del método get creado para dicho atributo de la clase. -->
        <h1><s:property value="saludosAtribute"></s:property></h1>
    </body>
</html>
