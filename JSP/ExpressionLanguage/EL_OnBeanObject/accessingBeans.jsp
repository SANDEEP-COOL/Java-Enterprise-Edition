<%@page import="beans.Person" %>
<html>
    
    <head></head>
    <body>

        <jsp:useBean id="p1" class="Person" />

        <jsp:setProperty name="p1" property="name" param="username" />
        <jsp:setProperty name="p1" property="age" param="userage" />
        <jsp:setProperty name="p1" property="rollNo" param="userrollno" />

        <p>Name : <strong>${p1.name}</strong></p>
        <p>Age : <strong>${p1.age}</strong></p>
        <p>RollNO : <strong>${p1.rollNo}</strong></p>

    </body>

</html>