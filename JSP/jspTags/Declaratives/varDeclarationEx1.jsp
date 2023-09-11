<html>

    <head></head>
    <body>

         <!-- Declaratives  -->
         <!-- whatever we declare inside Declaratives tag , gets pasted above the _jspService(),
         and treated as global variable  -->
        <%!
            int a = 100;
        %>

        <!-- Scriplets  -->
        <%
            out.println("<p>today is <strong>" + a + "</strong></p>");
        %>


    </body>

</html>