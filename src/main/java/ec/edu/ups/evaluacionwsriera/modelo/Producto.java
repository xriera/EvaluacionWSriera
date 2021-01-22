package ec.edu.ups.evaluacionwsriera.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Producto {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoProducto;
	private int cantidad;
	private double precio;
	
	@OneToMany(mappedBy = "producto",fetch = FetchType.EAGER,cascade = {CascadeType.ALL} )
	private List<CabeceraDetalle> listaCabecera;

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public List<CabeceraDetalle> getListaCabecera() {
		return listaCabecera;
	}

	public void setListaCabecera(List<CabeceraDetalle> listaCabecera) {
		this.listaCabecera = listaCabecera;
	}
	
	
}
