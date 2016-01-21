package modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COCINERO")
public class Cocinero {
	@Id
	@Basic(optional=false)
	private String dni_empleado;
	@Basic(optional=false)
	private String especialidad;
	@Basic(optional=false)
	private String conocimientos;
	
	@Override
	public String toString() {
		return 	"DNI: " + getDni_empleado() +
				"\nEspecialidad: " + getEspecialidad() +
				"\nConocimientos: " + getConocimientos() +
				"\n\n";
	}
	
	// Getters y setters
	public String getDni_empleado() {
		return dni_empleado;
	}
	public void setDni_empleado(String dni_empleado) {
		this.dni_empleado = dni_empleado;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getConocimientos() {
		return conocimientos;
	}
	public void setConocimientos(String conocimientos) {
		this.conocimientos = conocimientos;
	}
}
