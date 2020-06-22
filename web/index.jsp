<%-- 
    Document   : index
    Created on : 22/06/2020, 01:16:07 AM
    Author     : jackl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>CoCoffe</title>
        <link rel="icon"  type="image/png" href="img/icon.png">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>
    <body>
       
        <div class="container">
            <form action="Existance" method="GET" class="form">
                <div class="form-header">
                    <h1 class="form-title"><span>CoCoffe</span></h1>
                    <h3 class="form-title"><span>¿Que deseas pedir?</span></h3>
                </div>

                <label for="full-name" class="form-label">Nombre Completo:</label>
                <input type="text" class="form-input" placeholder="Escriba su Nombre Completo" name="full-name" id="full-name" required>

                <label for="full-address" class="form-label">Direccion:</label>
                <input type="text" class="form-input" placeholder="Escriba su Direccion" name="full-address" id="full-address" required>

                <div class="form-group">
                <label for="type_select" class="form-label">Escoja el tipo de Persona:</label>
                
                    <select class="form-control list" id="type_select" name="type_select">
                        <option value="Persona natural">Persona Natural</option>
                        <option value="Persona Corporativa">Persona Corporativa</option>
                    </select>
                </div> 

                <div class="form-group">
                    <label for="product_select" class="form-label">Seleccione el cafe que desea:</label>
                    
                        <select class="form-control list" id="product_select" name="product_select">
                            <option value="Capuccino">Capuccino</option>
                            <option value="Ristretto">Ristretto</option>
                            <option value="Macchiato">Macchiato</option>
                            <option value="Mocca">Mocca</option>
                            <option value="Frappé">Frappé</option>
                        </select>
                    </div>

                <label for="full-ammount" class="form-label">Cantidad:</label>
                <input type="text" class="form-input" placeholder="Cantidad" name="full-ammount" id="full-ammount" required>
    

                <input type="submit" value="Continuar" class="button-submit">

            </form>
        </div>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </body>
</html>
