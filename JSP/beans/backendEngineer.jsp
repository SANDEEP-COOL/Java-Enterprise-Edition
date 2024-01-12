<%@ page import="beans.*" %>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title> 
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css2?family=Pacifico&family=Urbanist:wght@100&display=swap" rel="stylesheet">

  </head>


<body style="width: 100vw; height: 100vh;" class="d-flex justify-content-center align-items-center flex-column text-primary">

    <h1 style="font-family: 'Pacifico', cursive;" class="text-dark" >This is <span class="text-danger">Java</span> Bean (Sandeep) Introduction...</h1>
    
    <jsp:useBean id="s" class="beans.BackendEng" scope="page" />
    <jsp:setProperty name="s" property="name" value="sandeep" />
    <jsp:setProperty name="s" property="technology" value="JAVA" />

    <h1 style="font-family: 'Urbanist', sans-serif; letter-spacing: 4px;"> Name is: <jsp:getProperty name="s" property="name" /> </h1>
    <h1 style="font-family: 'Urbanist', sans-serif; letter-spacing: 4px;"> Technology is: <jsp:getProperty name="s" property="technology" /> </h1>
    
</body>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</html>
