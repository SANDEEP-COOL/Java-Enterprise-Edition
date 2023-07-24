<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<html>

    <head></head>
    <body>

        <%!
        
            List<String> list = null; 
        
        %>

        <%
        
            list = new ArrayList<>();
            list.add("banana");
            list.add("mango");
            list.add("orange");
            list.add("apple");
            request.setAttribute("fruit", list);
        
        %>


        <%
                
               for(String item : list) {
                out.println("<strong>"+item+"</strong>")
               }

        %>

    </body>

</html>