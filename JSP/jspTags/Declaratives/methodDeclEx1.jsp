<html>

    <head></head>
    <body>

        <%!
            int add(int a, int b) {
                return a+b;
            }
        %>

        <%
        
            out.println("<p>Addition of 10 and 30 is : <strong>"+add(10, 30)+"</strong></p>");
            
        %>

    </body>

</html>