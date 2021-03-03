
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
        <title>Alta de Libros</title>
    </head>
    <body>
        <div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
                             <span class="login100-form-title">
                
                     Ingrese los datos requeridos
					</span>
         <form action="ServletPrueba" method="POST">
            <div class="wrap-input100">
                <span class="focus-input100"></span>
            Código de Libro: <input class="input100" type="text" name="cod_libro">
            
            Título: <input class="input100" type="text" name="titulo">
            Autor: <input class="input100"type="text" name="autor">
            Género: <select class="input100"name="genero">
                <option>Novela</option>
                <option>Cuento</option>
                <option>Poesia</option>
                <option>Otro</option>
            </select>
            Estado: <select class="input100" name="estado">
                <option>En catalogo</option>
                <option>Vendido</option>
                <option>Prestado</option>
                
            </select><br> 
            </div>
            <div class="container-login100-form-btn">
                <p align="right"><INPUT class="login100-form-btn" type="submit" value="ENVIAR"></p>
	    </div>
                        </div>
                    </div>
            </div>
        
                    
        </form>
        
    </body>
</html>