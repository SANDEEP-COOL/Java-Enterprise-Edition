<html>

    <head></head>

    <body>

        <%
        
            //declare vairiables - because it will be pasted inside _jspService()
            int i = 10;
            out.println(i);

            //creating Object of other class  
            java.util.Date date = new java.util.Date();
            out.println(date);


            //use built-in objects 

            /*we can't define a method inside scriplet - because this code code inside scriplet 
            is going to be pasted inside _jspService() by jspContainer , so how can _jspService() being a method 
            can have another method defination inside itself 
            public void print() {
                out.println("<h1>sandeep</h1>");
            }
            */

            /*
            jvm always binds static variable to class level,
            that's why we can't declare static variable inside scriplet,
            otherwise it will be taken as local 
            static int x = 100;
            out.println(x);
            */
        
            //we can't directly write html in scriplet 
            //<h1></h1>
        %>

    </body>

</html>