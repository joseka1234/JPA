package main;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PROVEEDOR")
public class Proveedor {
	@Id
	@Basic(optional=false)
	private int id_proveedor;
	@Basic(optional=false)
	private String nombre;
	@Basic(optional=false)
	private int telefono;
	@Basic(optional=false)
	private String especialidad;
	
	@Override
	public String toString() {
		return 	"ID: " + getId_proveedor() +
				"\nNombre: " + getNombre() +
				"\nTelefono: " + getTelefono() +
				"\nEspecialidad: " + getEspecialidad() +
				"\n";
	}

	// Getters y setters
	public int getId_proveedor() {
		return id_proveedor;
	}
	public void setId_proveedor(int id_proveedor) {
		this.id_proveedor = id_proveedor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
}
