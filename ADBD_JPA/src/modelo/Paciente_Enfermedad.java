package modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(PEKey.class)
@Table(name="PACIENTE_ENFERMEDAD")
public class Paciente_Enfermedad {
	@Id
	@Basic(optional=false)
	private String dni_paciente;
	@Id
	@Basic(optional=false)
	private int id_enfermedad;
	
	@Override
	public String toString() {
		return 	"DNI: " + getDni_paciente() +
				"\nEnfermedad: " + getId_enfermedad() +
				"\n\n";
	}
	
	// Getters y setters
	public String getDni_paciente() {
		return dni_paciente;
	}
	public void setDni_paciente(String dni_paciente) {
		this.dni_paciente = dni_paciente;
	}
	public int getId_enfermedad() {
		return id_enfermedad;
	}
	public void setId_enfermedad(int id_enfermedad) {
		this.id_enfermedad = id_enfermedad;
	}
}
