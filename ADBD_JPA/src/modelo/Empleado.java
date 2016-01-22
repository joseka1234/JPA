package modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLEADO")
public class Empleado extends Tabla  {
	@Id
	@Basic(optional=false)
	private String dni_empleado;
	@Basic(optional=false)
	private String nombre;
	@Basic(optional=false)
	private String apellido;
	@Basic(optional=false)
	private double sueldo;
	@Basic(optional=false)
	private String telefono;
	
	@Override
	public String toString() {
		return 	"DNI: " + getDni_empleado() +
				"\nNombre: " + getNombre() +
				"\nApellido: " + getApellido() +
				"\nSueldo: " + getSueldo() +
				"\nTelefono: " + getTelefono() +
				"\n\n";
	}
	
	// Getters y setters
	public String getDni_empleado() {
		return dni_empleado;
	}
	public void setDni_empleado(String dni_empleado) {
		this.dni_empleado = dni_empleado;
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
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
