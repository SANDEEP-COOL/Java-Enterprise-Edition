
<!doctype html>
<html lang="en">

  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>accessingCoderAndLaptopBeans1</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
  </head>



  <body>

    <div>

        <jsp:useBean id="sandeep" class="beans.Coder"/>
        <jsp:setProperty name="sandeep" property="name" value="${param.coderName}"/>
        <jsp:setProperty name="sandeep" property="age" value="${param.coderAge}"/>
        <jsp:setProperty name="sandeep" property="field" value="${param.coderField}"/>

        <h1>Name is ${sandeep.name} , Age is ${sandeep.age} and Field is ${sandeep.field}....</h1>
        
    </div>

  </body>
</html>