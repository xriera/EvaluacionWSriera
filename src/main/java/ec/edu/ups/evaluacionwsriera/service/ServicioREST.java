package ec.edu.ups.evaluacionwsriera.service;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import ec.edu.ups.evaluacionwsriera.modelo.Producto;
import ec.edu.ups.evaluacionwsriera.negocio.GestionON;

@Path("/cliente")
public class ServicioREST {
	
	@Inject
	private GestionON on;
	
	@GET
	@Path("/buscar")
	@Produces("application/json")
	public Respuesta buscarProducto(@QueryParam("codigoProdcuto") int codigoProducto) {
	
        Respuesta resp = new Respuesta();
        try {
        	
           Producto p=  on.buscarProducto(codigoProducto);
           System.out.println("producto"+p);
            System.out.println("retirando...");
             resp.setCodigo(1);
	         resp.setMensaje("retirando satisfactorio");
           
          //return "retirado";
        } catch (Exception e) {
            e.printStackTrace();
             resp.setCodigo(-1);
	  resp.setMensaje("ERROR AL retirandorrrrrrrrr");
            
        }
        return resp;
		
	}
	
}
