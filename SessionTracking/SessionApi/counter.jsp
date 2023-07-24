<html>

    <head></head>
    <body>

        <%
        
            HttpSession sess = request.getSession();
            int count = 0;
            String btn = (String)request.getParameter("btn");
            if(btn != null) {

                if(sess.getAttribute("counter")!=null) 
                {

                    String cval = (String)sess.getAttribute("counter");
                    if(btn.equals("Next"))
                        count = Integer.parseInt(cval) + 1;
                    else 
                        count = Integer.parseInt(cval) - 1;                   

                }
                
            }

            sess.setAttribute("counter", String.valueOf(count));
            out.println("<h2>Count is "+count+"</h2>");

        %>

        <form action="counter.jsp">

            <input type="submit" name="btn" value="Next"/>
            <input type="submit" name="btn" value="Privous"/>

        </form>     

    </body>

</html>