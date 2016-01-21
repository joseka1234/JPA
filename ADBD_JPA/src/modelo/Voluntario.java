package modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VOLUNTARIO")
public class Voluntario {
	@Id
	@Basic(optional=false)
	private String dni_voluntario;
	@Basic(optional=false)
	private String nombre;
	@Basic(optional=false)
	private String apellido;
	@Basic(optional=false)
	private int telefono;
	
	@Override
	public String toString() {
		return 	"DNI: " + getDni_voluntario() +
				"\nNombre: " + getNombre() +
				"\nApellido: " + getApellido() +
				"\nTelefono: " + getTelefono() +
				"\n\n";
	}
	
	// Getters y setters
	public String getDni_voluntario() {
		return dni_voluntario;
	}
	public void setDni_voluntario(String dni_voluntario) {
		this.dni_voluntario = dni_voluntario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
}
