/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 *
 * @author samuel
 */
@Path("Bicicletas")
public class Bicicletas {
    
     @GET
    public String[] empelado(@QueryParam("bicicletas_disponibles") String biciDisponibles) throws IOException {
        System.out.println("GET.Bicicletas.bicicleta()");
        return muestraContenido("C:/Users/W/Documents/UNIVERSIDAD/SEMESTRE8/ING.SOFTV/nombreBD.txt",biciDisponibles);
        
        
        
    }
    
    public String[] muestraContenido(String archivo,String biciDisponibles) throws FileNotFoundException, IOException {
      String cadena,lista="";
      int i=0;
      String listaBicicletas[]= new String[58];
      FileReader f = new FileReader(archivo);
      BufferedReader b = new BufferedReader(f);
      while((cadena = b.readLine())!=null) {
          listaBicicletas[i] = cadena;
          i=i+1;
      }
      b.close();
      return listaBicicletas; 
}
    
}
