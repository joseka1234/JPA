package modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CAMARERO")
public class Camarero extends Tabla  {
	@Id
	@Basic(optional=false)
	private String dni_empleado;
	@Basic(optional=false)
	private String experiencia;
	
	@Override
	public String toString() {
		return 	"DNI: " + getDni_empleado() +
				"\nExperiencia: " + getExperiencia() +
				"\n\n";
	}
	
	// Getters y setters
	public String getDni_empleado() {
		return dni_empleado;
	}
	public void setDni_empleado(String dni_empleado) {
		this.dni_empleado = dni_empleado;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
}
