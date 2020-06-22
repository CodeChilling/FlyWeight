<%-- 
    Document   : index
    Created on : 22/06/2020, 01:16:07 AM
    Author     : jackl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>VoidCoffee</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
    </head>
    <body>
        <form action="Existance" method="GET">
            <input type="text" placeholder="Escriba su nombre completo" name="full-name" id="full-name" required>
            <input type="text" placeholder="Escriba su dirección" name="full-address" id="full-address" required>
            <select id="type_select" name="type_select">
                        <option value="Persona natural">Persona natural</option>
                        <option value="Persona corporativa">Persona corporativa</option>
            </select>
            <select id="product_select" name="product_select">
                        <option value="Capuccino">Capuccino</option>
                        <option value="Ristretto">Ristretto</option>
                        <option value="Macchiato">Macchiato</option>
                        <option value="Mocca">Mocca</option>
                        <option value="Frappé">Frappé</option>
            </select>
            <input type="text" placeholder="Cantidad" name="full-ammount" id="full-ammount" required>
            <input type="submit" value="Continuar">
                
        </form>
    </body>
</html>