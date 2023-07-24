<html>

    <head></head>
    <body>

        <%

            String url = "manually.jsp;jsessionid="+session.getId();
        
        %>

        <form action="<%= url %>">

            <input type="submit"/>

        </form>

    </body>

</html>