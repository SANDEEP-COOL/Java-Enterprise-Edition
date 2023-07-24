<%@page import="beans.Person" %>
<html>

    <head></head>
    <body>

        <jsp:useBean id="obj1" class="beans.Person"/> 

        <jsp:setProperty name="obj1" property="name" param="username"/>
        <jsp:setProperty name="obj1" property="age" param="userage"/>
        <jsp:setProperty name="obj1" property="rollNo" param="userrollno"/>

        Name : <strong><jsp:getProperty name="obj1" property="name"/></strong><br>
        Age : <strong><jsp:getProperty name="obj1" property="age"/></strong><br>
        RollNo : <strong><jsp:getProperty name="obj1" property="rollNo"/></strong><br>
        
    </body>

</html>