package modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PACIENTE")
public class Paciente extends Tabla  {
	@Id
	@Basic(optional=false)
	private String dni_paciente;
	@Basic(optional=false)
	private String nombre;
	@Basic(optional=false)
	private String apellido;
	@Basic(optional=false)
	private int telefono;
	@Basic(optional=false)
	private String dni_sanitario;
	
	@Override
	public String toString() {
		return 	"DNI: " + getDni_paciente() +
				"\nNombre: " + getNombre() +
				"\nApellido: " + getApellido() +
				"\nTelefono: " + getTelefono() +
				"\nSanitario: " + getDni_sanitario() +
				"\n\n";
	}
	
	// Gettesr y setters
	public String getDni_paciente() {
		return dni_paciente;
	}
	public void setDni_paciente(String dni_paciente) {
		this.dni_paciente = dni_paciente;
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
	public String getDni_sanitario() {
		return dni_sanitario;
	}
	public void setDni_sanitario(String dni_sanitario) {
		this.dni_sanitario = dni_sanitario;
	}
}
