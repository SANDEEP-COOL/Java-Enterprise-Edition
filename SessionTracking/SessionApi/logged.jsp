<%@ page import="javax.servlet.http.HttpSession"%>
<html>

    <head></head>
    <body>
            <%
            
                String userName = request.getParameter("name");
                session.setAttribute("name", userName);
                session.setMaxInactiveInterval(10);

            %>

        <p>Dear <%= userName %>! logged in successfully, now you can visit <a href="welcome.jsp?user=<%= userName %>">welcome page</a></p>
    </body>

</html>