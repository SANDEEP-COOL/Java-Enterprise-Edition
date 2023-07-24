
<html>

    <head></head>
    <body>

        <%!
        
            java.util.Date date = new java.util.Date();

        %>

        <form action="welcome.jsp">
            <label for="name">Type your name</label>

            
            <input type="text" id="name" name="name"/>

            <!-- hidden fields -->
            <input type="hidden" value="<%= date %>" name="date"/>


            <input type="submit"/>
        </form>

    </body>

</html>