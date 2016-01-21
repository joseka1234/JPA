package modelo;

import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(PCKey.class)
@Table(name="PACIENTE_COME")
public class Paciente_Come {
	@Id
	@Basic(optional=false)
	private String dni_paciente;
	@Id
	@Basic(optional=false)
	private int id_menu;
	@Basic(optional=false)
	private Date fecha;
	
	@Override
	public String toString() {
		return 	"DNI: " + getDni_paciente() +
				"\nMenu: " + getId_menu() +
				"\nFecha: " + getFecha() +
				"\n\n";
	}
	
	// Getters y setters
	public String getDni_paciente() {
		return dni_paciente;
	}
	public void setDni_paciente(String dni_paciente) {
		this.dni_paciente = dni_paciente;
	}
	public int getId_menu() {
		return id_menu;
	}
	public void setId_menu(int id_menu) {
		this.id_menu = id_menu;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
