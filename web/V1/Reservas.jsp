<%-- 
    Document   : Reservas
    Created on : 9/10/2018, 02:40:50 PM
    Author     : W
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <script>
             

            function enviarRequest() {
                // obtenemos e valor por el numero de elemento
                var tipoReserv =document.getElementsByName("tipoReserva")[0].value;
                var cantid = document.getElementsByName("cantidad")[0].value;
                window.alert(tipoReserv + cantidad);
                var json={datos:[{tipoReserva: tipoReserv},{cantidad:cantid}]};
                var obj = JSON.parse(json);
                location.href ="/ServiciosEnciclaAPI/app/Reservas/crear";
            }
        </script>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>BIENVENIDO AL SERVICIO DE RESERVAS DE ENCICLA!</h1>
        <form name="miformulario" action="mipagina.php" method="POST">
        <h5>Digíta el tipo de reserva que se realizara</h5>
        <input type="text" size="20" name="tipoReserva">
        <h5>Digíta la cantidad de personas a la que se le realizara la reserva</h5>
        <input type="text" size="20" name="cantidad">
        <input type="button" value="Realizar Reserva" onclick="enviarRequest()"/></br>
        </form>
    </body>
</html>
