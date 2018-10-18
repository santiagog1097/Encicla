/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 *
 * @author W
 */
@Path("Biometricos")
public class Biometricos {
    
    @GET
    public String control(@QueryParam("idUsuario") int idUsuario){
        return String.valueOf(idUsuario);
    
    }
    
}
