package ec.edu.ups.evaluacionwsriera.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.evaluacionwsriera.modelo.CabeceraDetalle;
import ec.edu.ups.evaluacionwsriera.modelo.Producto;

@Stateless
public class CabeceraDetalleDAO {
	@PersistenceContext
    private EntityManager em;
	
	public void insertCabecera(CabeceraDetalle cabeceraDeatalle) {
		em.persist(cabeceraDeatalle);
	}
	
	public Producto buscarCabecera(int codigoProducto) {
		return em.find(Producto.class, codigoProducto);
	}
}
