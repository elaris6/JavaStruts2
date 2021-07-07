<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
    <head>
        <!-- Importamos un atributo de Tiles mediante la función "insertAttribute"
        La propiedad "ignore" solo sirve para que en caso de error, ignore el atributo. -->
        <title>
            <tiles:insertAttribute name="title" ignore="true" />
        </title>
    </head>
    <!-- Se define la estructura principal del "layout", incluyendo en cada sección
    las referencias a los nombres de los huecos que seran usados para cargar en ellos
    cada JSP según interese en función de las acciones. -->
    <body>
        <table border="1" cellpadding="2" cellspacing="2" align="center">
            <tr>
                <td height="30" colspan="2">
                    <tiles:insertAttribute name="header"/>
                </td>
            </tr>
            <tr>
                <td height="250">
                    <tiles:insertAttribute name="menu"/>
                </td>
                <td width="350">
                    <tiles:insertAttribute name="body" />
                </td>
            </tr>
            <tr>
                <td height="30" colspan="2">
                    <tiles:insertAttribute name="footer" />
                </td>
            </tr>
        </table>
    </body>
</html>
