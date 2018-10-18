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
 * @author W
 */
@Path("Empleados")
public class empleados {
    @GET
    public String[] empelado(@QueryParam("nombreEmpresa") String nombreEmpresa) throws IOException {
        System.out.println("GET.empleados.empelado()");
        return muestraContenido("C:/Users/W/Documents/UNIVERSIDAD/SEMESTRE8/ING.SOFTV/nombreBD.txt",nombreEmpresa);
        
        
        
    }
    
    public String[] muestraContenido(String archivo,String nombreEmpresa) throws FileNotFoundException, IOException {
      String cadena,lista="";
      int i=0;
      String listaEmpleados[]= new String[58];
      FileReader f = new FileReader(archivo);
      BufferedReader b = new BufferedReader(f);
      while((cadena = b.readLine())!=null) {
          listaEmpleados[i] = cadena;
          i=i+1;
      }
      b.close();
      return listaEmpleados; 
}

}
