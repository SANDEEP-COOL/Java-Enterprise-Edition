<%@page import="beans.DogEL" %>
<%@page import="beans.PersonEL" %>
<%@page import="javax.servlet.RequestDispatcher" %>

<html>

    <head></head>
    <body>

        <jsp:useBean id="person" class="PersonEL" scope="request" />
        <jsp:useBean id="dog" class="DogEL" />
        <jsp:setProperty name="person" property="name" value="${param.personName}"/> 
        <jsp:setProperty name="person" property="age" value="${param.personAge}"/>
        <jsp:setProperty name="dog" property="name" value="${param.dogName}"/>       
        <jsp:setProperty name="dog" property="breed" value="${param.dogBreed}"/>       

        <jsp:setProperty name="person" property="dog" value="${pageScope.dog}"/>

        <%
        
            RequestDispatcher dispatcher = request.getRequestDispatcher("showPerson.jsp");
            dispatcher.forward(request, response);
        
        %>
    </body>

</html>