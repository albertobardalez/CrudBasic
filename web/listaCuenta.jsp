  

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="Logic.Cuenta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado de Cuenta</h1>
        <a href="index.jsp">
            back to menu
        </a>
        
        <%
        HttpSession mySession = request.getSession();  
        
        List<Cuenta>listaCuenta = new ArrayList<Cuenta>();
        
        
        listaCuenta = (List<Cuenta>) mySession.getAttribute("Cuenta");
        
        %>
        <table border="1" width="600">
            <thead bgcolor="skyblue">
                <th>Id</th>
                <th>Usuario</th>
                <th>Contrasenia</th>
            </thead> 
            <tbody>
                
                
                
                <tr>
                    
                    <%
                    for(Cuenta cuenta: listaCuenta){ 
                    
                    %>
                    
                    <td><%= cuenta.getIdCuenta()%></td>
                    <<td><%= cuenta.getUsuario() %></td>
                    <td><%= cuenta.getContrasenia() %></td>
                    
                    
                   
                </tr>
                <%
                    }
                %>
            </tbody>
            
        </table>
      
    </body>
</html>
