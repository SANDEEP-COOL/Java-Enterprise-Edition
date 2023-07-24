<html>

    <head></head>
    <body>

        <%

        String  url;
        url=response.encodeUrl("encodeUrl.jsp”); 
        
        
        %>

        <form action="<%= url %>">

            <input type="submit"/>

        </form>
    </body>

</html>