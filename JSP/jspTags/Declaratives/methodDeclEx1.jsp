<html>

    <head></head>
    <body>

        <!-- we can declare method inside declarative tag,
        because this declaration of method will be pasted inside .java program,
        not inside service method -->
        <%!
            int add(int a, int b) {
                return a+b;
            }
        %>

        <!-- we can use a particular method from inside Scriplets -->
        <%
        
            out.println("<p>Addition of 10 and 30 is : <strong>"+add(10, 30)+"</strong></p>");
            
        %>

    </body>

</html>