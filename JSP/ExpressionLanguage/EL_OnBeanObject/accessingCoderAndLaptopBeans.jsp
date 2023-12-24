<%@page import = "javax.servlet.RequestDispatcher"%>

<!doctype html>
<html lang="en">

  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>accessingCoderAndLaptopBeans</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
  </head>



  <body>
    
    <jsp:useBean id="sandeep" class="beans.Coder" scope="request"/>

    <jsp:setProperty name = "sandeep" property = "name" param = "coderName"/>
    <jsp:setProperty name = "sandeep" property = "age" param = "coderAge"/>
    <jsp:setProperty name = "sandeep" property = "field" param = "coderField"/>

    <jsp:useBean id="acer" class="beans.Laptop"/>

    <jsp:setProperty name = "acer" property = "name" param = "laptopName"/>
    <jsp:setProperty name = "acer" property = "price" param = "laptopPrice"/>

    <div>

        <h1>Coder Name is ${sandeep.name}</h1>
        <h1>Coder Age is ${sandeep.age}</h1>
        <h1>Coder Field is ${sandeep.field}</h1>
        <h1>Laptop Name is ${acer.name}</h1>
        <h1>Laptop Price is ${acer.price}</h1>

        <!-- Since SANDEEP is only accessible inside page scope, 
        so you can not access it in the request scope  -->
        <h1>Accessing using pageScope ${pageScope.sandeep.name}</h1>

    </div>

    <%

        RequestDispatcher rd = request.getRequestDispatcher("coderAndLaptopScope.jsp");
        rd.forward(request , response);

    %>

  </body>
</html>