package modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SANITARIO")
public class Sanitario {
	@Id
	@Basic(optional=false)
	private String dni_sanitario;
	@Basic(optional=false)
	private String nombre;
	@Basic(optional=false)
	private String apellido;
	@Basic(optional=false)
	private int telefono;
	@Basic(optional=false)
	private double sueldo;
	@Basic(optional=false)
	private String consulta;
	@Basic(optional=false)
	private String especialidad;
	
	@Override
	public String toString() {
		return 	"DNI: " + getDni_sanitario() +
				"\nNombre: " + getNombre() +
				"\nApellido: " + getApellido() +
				"\nTelefono: " + getTelefono() +
				"\nSueldo: " + getSueldo() +
				"\nConsulta: " + getConsulta() +
				"\nEspecialidad: " + getEspecialidad() +
				"\n\n";
	}
	
	// Getters y setters
	public String getDni_sanitario() {
		return dni_sanitario;
	}
	public void setDni_sanitario(String dni_sanitario) {
		this.dni_sanitario = dni_sanitario;
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
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String getConsulta() {
		return consulta;
	}
	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}	
}
