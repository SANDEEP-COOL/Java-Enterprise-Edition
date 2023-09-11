<html>

    <head></head>

    <body>

        <!-- 1. jsp technology provides 9 predefined objects which we can use in every jsp page  -->
        <!-- predefined object - we don't need to import these object, they are preimported -->
        <%
        
            // obj1 - out
            out.println("out is first object inside jsp page");

            //obj - 2
            String name = request.getParameter("name");
            out.print("name - "+name);
            
            //obj - 3
            response.setContentType("text/html");

            //obj - 4
            session.setAttribute("userid" , 123);

            //obj - 5
            application.setAttribute("appname" , "myWebApp");

            //obj - 6
            String paramValue = config.getInitParameter("name"); 
            out.print("paramValue - "+paramValue);

            //obj - 7 
            //pageContext - encapsulates all the above objects
            String userId = (String) pageContext.getAttribute("userId");
            out.print(userId);

        %>

    </body>

</html>