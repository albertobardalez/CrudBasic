
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="Logic.Empleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List User</h1>
        <%
            HttpSession mySession = request.getSession();
            List<Empleado>listaUsuario = new ArrayList<Empleado>();
            listaUsuario = (List<Empleado>)mySession.getAttribute("Empleado");
        
        
        %>
        <table border="1" width="600">
            <thead bgcolor="skyblue">
                <th>Id</th>
                <th>Name</th>
                <th>Last Name</th>
                <th>Edge</th>
            </thead>
            
            <tbody>
                <tr>
                    <%
                    for(Empleado empleado: listaUsuario){
                        
                
                    %>
               
                    <td><%= empleado.getId()%></td>
                    <td><%= empleado.getNombre()%></td>
                    <td><%= empleado.getApellido()%></td>
                    <td><%= empleado.getEdad()%></td>
                
                 </tr>
                 
                    <%
                        }
                    %>
            </tbody>
            
        </table>
    </body>
</html>
