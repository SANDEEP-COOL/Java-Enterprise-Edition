<html>

    <head></head>
    <body>

        <%
        
            String name = request.getParameter("name");
            String date = request.getParameter("date");

        %>

        <h3>Welcome <%= name %></h3>
        <p>The current date is <strong> <%= date %> </strong> </p>

    </body>

</html>