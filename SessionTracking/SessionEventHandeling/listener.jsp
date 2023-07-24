<%@ page import="SessionTracking.SessionEventHandeling.MyListenerForSession" %>
<html>

    <head></head>
    <body>

        <%
        
            out.println("gg "+MyListenerForSession.count);
            out.println("<p>Currently "+MyListenerForSession.count+" are activate</p>");

        %>

    </body>

</html>