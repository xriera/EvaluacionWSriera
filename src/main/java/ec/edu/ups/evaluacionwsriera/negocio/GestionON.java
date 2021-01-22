package ec.edu.ups.evaluacionwsriera.negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.evaluacionwsriera.dao.ProductoDAO;
import ec.edu.ups.evaluacionwsriera.modelo.Producto;

@Stateless
public class GestionON {
	
	@Inject
	private ProductoDAO daoProducto;
	
	public Producto buscarProducto(int codigoProducto) throws Exception {
		try {
			return daoProducto.buscarProducto(codigoProducto);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new Exception("Error al registrar cliente");
		}
		
	}
}
