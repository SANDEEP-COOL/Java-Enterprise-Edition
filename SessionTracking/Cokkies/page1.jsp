<html>

    <head></head>
    <body>

        <%

            Cookie ck = new Cookie("lastVisit", "10:00pm");

            ck.setMaxAge(60);

            response.addCookie(ck); 
        %>

        <br>
        <a href="page2.jsp">Click here to go to page2</a>

    </body>

</html>