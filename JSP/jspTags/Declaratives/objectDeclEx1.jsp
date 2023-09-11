<html>

    <head></head>
    <body>

        <!-- we can declare objects in declaratives  -->
        <%!
            java.util.Date date = new java.util.Date();
        %>

        <!-- we can use those variables inside scriplet  -->
        <%
            out.println("<p>date is : "+date+"</p>");
        %>

    </body>

</html>