<%-- 
    Document   : Empleados
    Created on : 9/10/2018, 02:10:07 PM
    Author     : W
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="jquery.min.js"></script>
        <script src="https://apis.google.com/js/client:platform.js?onload=renderButton" async defer></script>
        <script>
             

            function enviarRequest() {
                // obtenemos e valor por el numero de elemento
                var porNombre =document.getElementsByName("campo")[0].value;
                window.alert(porNombre);
                location.href ="/ServiciosEnciclaAPI/app/Empleados?nombreEmpresa="+ porNombre;
            }
        </script>
        <title>JSP Page</title>
    </head>
    <body>
        <form id="f1">
        <h1>Aqui podras visualizar la información de los empleados que pertenecen a tu organización!</h1>
        <input type="button" value="VER LISTA DE EMPLEADOS" onclick="enviarRequest()"/></br>
        <h5>Digíta el nombre de la empresa por la cual deseas buscar</h5>
        <input type="search" name="campo" id="capoEmpresa" />    
        </form>
        
    </body>
</html>
