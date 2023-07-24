<html>

    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
        <style>

            .shadow{

                box-shadow: rgba(17, 12, 46, 0.15) 0px 48px 100px 0px;

            }

        </style>
    </head>
    <body>

        <div class="d-flex justify-content-center flex-column align-items-center shadow w-100 h-100">

            <div class="shadow p-4 w-50 h-40">

                <h1>Person's Details...</h1>
                <p>Name : <strong>${requestScope.person.name}</strong></p>
                <p>Age : <strong>${requestScope.person.age}</strong></p>
                <p>DogName : <strong>${requestScope.person.dog.name}</strong></p>
                <p>DogAge : <strong>${requestScope.person.dog.breed}</strong></p>


            </div>


        </div>

    </body>

</html>