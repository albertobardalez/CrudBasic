<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Enter your date</h1>
        <form action="CrearCuenta" method="GET">
            <label for="name">usuario:</label> 
            <input id="name" type="text"  name="name" required><br>
            <label for="pass">Contraseña:</label>
            <input id="pass" type="password" name="pass" required ><br>
            <button type="submit">Enviar</button>
        </form>
        
        <a href="index.jsp"> Back to menu</a>
    </body>
</html>
