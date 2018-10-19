<%-- 
    Document   : index
    Created on : 18/10/2018, 11:35:43 AM
    Author     : W
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <h1>API DE ENCICLA AL SERVICIO DE SU ORGANIZACION </h1>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="google-signin-client_id" content="344736361366-rkeu0n5901a5fhienscplhgfmaiv1f6m.apps.googleusercontent.com">
        <script src="jquery.min.js"></script>
        <script src="https://apis.google.com/js/client:platform.js?onload=renderButton" async defer></script>
        <script>
            function irA(){
                location.href ="/ServiciosEnciclaAPI/V1/Empleados.jsp";
            }
            
            function irAReservas(){
                location.href ="/ServiciosEnciclaAPI/V1/Reservas.jsp";
            }
            
            function irAIdentificacion(){
                location.href ="/ServiciosEnciclaAPI/V1/Identificaciones.jsp";
            }
            
            function irAPublicidad(){
                location.href ="/ServiciosEnciclaAPI/V1/publicidades.jsp";
            }
            
            function irABicicletas(){
                location.href="/ServiciosEnciclaAPI/V1/Bicicletas.jsp";
            }
            
            function irABiometrico(){
                location.href="/ServiciosEnciclaAPI/V1/Biometricos.jsp";
            }
           
        </script>
        <!-- HTML for render Google Sign-In button -->
    <div id="gSignIn"></div>
    <input type="button" value="Servicio informativo" onclick="irA()"></br>
    <input type="button" value="Servicio de reservas" onclick="irAReservas()"></br>
    <input type="button" value="Servicio de identificaciones" onclick="irAIdentificacion()"></br>
    <input type="button" value="Servicio de publicidad" onclick="irAPublicidad()"></br>
    <input type="button" value="Servicio de trafico de bicicletas" onclick="irABicicletas()"></br>
    <input type="button" value="Servicio biometrico" onclick="irABiometrico()">
    <!-- HTML for displaying user details -->
    <div class="userContent"></div>
    <title>JSP Page</title>
</head>
<body>
    
</body>
</html>


