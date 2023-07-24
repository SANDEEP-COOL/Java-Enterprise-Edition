<%@page import="java.util.Date" %>
<html>

    <head></head>
    <body>

        <%
        
            String s = "sandeep patel";
            Date d = new Date();
            request.setAttribute("s" , s);
            request.setAttribute("d", d);

            String s1 = "kamlesh patel";
            pageContext.setAttribute("s1", s1);

            String s2 = "laychi patel";
            session.setAttribute("s2", s2);
        %>

        <p>String s : <strong>${requestScope.s}</strong></p>
        <p>Date d : <strong>${requestScope.d}</strong></p>

        <p>String s1 : <strong>${pageScope.s1}</strong></p>
        
        <p>String s2 : <strong>${sessionScope.s2}</strong></p>
    </body>

</html>