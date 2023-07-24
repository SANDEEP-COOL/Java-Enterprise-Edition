<html>

    <head></head>
    <body>

        <%
        
            String name = request.getParameter("user");

            if(name == null) {

                out.println("<p>Please Login first!</p>");

            }
            else if(name != null) {

                out.println("<p>Welcome "+session.getAttribute("name")+" to welcome page...</p>");

            }

        %>

    </body>

</html>