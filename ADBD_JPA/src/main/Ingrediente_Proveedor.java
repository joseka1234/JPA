package main;

import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(IPKey.class)
@Table(name="INGREDIENTE_PROVEEDOR")
public class Ingrediente_Proveedor {

	@Id
	@Basic(optional=false)
	private int id_ingrediente;
	@Id
	@Basic(optional=false)
	private int id_proveedor;
	@Id
	@Basic(optional=false)
	private Date fecha;
	@Basic(optional=false)
	private int cantidad;
	@Basic(optional=false)
	private double precio;
	@Basic(optional=false)
	private Date fecha_caducidad;
	
	@Override
	public String toString() {
		return	"ID: " + getId_ingrediente() +
				"\nProveedor: " + getId_proveedor() + 
				"\nFecha: " + getFecha() +
				"\nCantidad: " + getCantidad() +
				"\nPrecio: " + getPrecio() +
				"\nFecha caducidad: " + getFecha_caducidad() +
				"\n";
	}
	
	// Getters y setters
	public int getId_ingrediente() {
		return id_ingrediente;
	}
	public void setId_ingrediente(int id_ingrediente) {
		this.id_ingrediente = id_ingrediente;
	}
	public int getId_proveedor() {
		return id_proveedor;
	}
	public void setId_proveedor(int id_proveedor) {
		this.id_proveedor = id_proveedor;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
	public Date getFecha_caducidad() {
		return fecha_caducidad;
	}
	public void setFecha_caducidad(Date fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}
}

