<html>

    <head></head>
    <body>

        <%
        
            String str = "one";
            String str1 = "two";

            String[] strArr = new String[]{str, str1};
        
            pageContext.setAttribute("strArr" , strArr);

        %>        

        <p>str : <strong>${pageScope.strArr[0]}</strong></p>
        <p>str1 : <strong>${pageScope.strArr[1]}</strong></p>

    </body>

</html>