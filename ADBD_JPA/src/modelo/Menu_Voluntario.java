package modelo;

import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(MVKey.class)
@Table(name="MENU_VOLUNTARIO")
public class Menu_Voluntario extends Tabla  {
	@Id
	@Basic(optional=false)
	private int id_menu;
	@Id
	@Basic(optional=false)
	private String dni_voluntario;
	@Id
	@Basic(optional=false)
	private Date fecha;
	
	@Override
	public String toString() {
		return 	"Menu: " + getId_menu() +
				"\nVoluntario: " + getDni_voluntario() +
				"\nFecha: " + getFecha() +
				"\n\n";
	}
	
	// Getters y setters
	public int getId_menu() {
		return id_menu;
	}
	public void setId_menu(int id_menu) {
		this.id_menu = id_menu;
	}
	public String getDni_voluntario() {
		return dni_voluntario;
	}
	public void setDni_voluntario(String dni_voluntario) {
		this.dni_voluntario = dni_voluntario;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
}
