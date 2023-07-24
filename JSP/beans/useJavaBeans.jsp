<%@page import="beans.Person" %>
<html>

    <head></head>
    <body>

        <jsp:useBean id="p1" class="beans.Person" scope="session"/>

        <jsp:setProperty name="p1" property="name" value="RAM"/>
        <jsp:setProperty name="p1" property="age" value="20"/>
        <jsp:setProperty name="p1" property="rollNo" value="100"/>

        <jsp:getProperty name="p1" property="name"/>
        <jsp:getProperty name="p1" property="age"/>
        <jsp:getProperty name="p1" property="rollNo"/>

    </body>

</html>