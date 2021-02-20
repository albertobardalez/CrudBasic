

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Create your count</h1>
        
        
        <form action="crearEmpleado" method="GET">
            <label for="name">Name:</label>
            <input id="name" type="text" name="name" required=><br>
            <label for="lastName">Last Name</label>
            <input id="lastName" type="text" name="lastName" required><br>
            <label for="age">Age:</label>
            <input id="age" type="text" name="age" required><br><br>
            <label for="IdCuenta">Id de la Cuenta:</label>
            <input min="1" id="IdCuenta" type="number" name="idCuenta" required><br>
            <input type="submit" name="save" value="Save"><br><br>
            <a href="index.jsp" style="text-decoration: none">
                Back to Menu
            </a>
            
            
            
        </form>
    </body>
</html>
