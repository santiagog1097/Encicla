/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author W
 */
   
public class Reservas {
   @POST
   @Path("/create")
   @Consumes(MediaType.APPLICATION_JSON)
    public String reservas(){
        return "HOLA";
    }
    
}
