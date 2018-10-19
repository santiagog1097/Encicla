/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import java.io.*;
import java.io.FileWriter;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author W
 */
@Path("Reservas")
public class Reservas {
   @POST
   @Path("crear")
   @Consumes("application/json")
   @Produces("application/json")
   public String agregarReserva(String Archivo) {
     Escribir("Reserva.txt",Archivo);
     return Archivo;
   }
   public static void Escribir(String nombre, String Reserva)
    {
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        
        try {
            archivo = new File(nombre);
            if(!archivo.exists()){
                archivo.createNewFile();
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                //Se escribe en el archivo
                linea.println(Reserva);
                linea.close();
                escribir.close();
            }else{
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                //Se escribe en el archivo
                linea.println(Reserva);
                linea.close();
                escribir.close();
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
   
    
   
}
