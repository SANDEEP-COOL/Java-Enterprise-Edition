    <html>

        <head></head>
        <body>

            <% 
                Cookie[] cookies = request.getCookies();
                out.println("length : "+cookies.length);
                if(cookies != null) 
                {
                    for(Cookie c : cookies)
                    {

                        if(c.getName().equals("lastVisit")) {

                            out.println(c.getValue())

                        }

                    }
                }
            %>


        </body>

    </html>