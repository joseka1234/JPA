package modelo;

import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(MSeKey.class)
@Table(name="MENU_SERVIDO")
public class Menu_Servido {
	@Id
	@Basic(optional=false)
	private String dni_empleado;
	@Id
	@Basic(optional=false)
	private int id_menu;
	@Id
	@Basic(optional=false)
	private Date fecha;
	
	@Override
	public String toString() {
		return 	"DNI: " + getDni_empleado() +
				"\nMenu: " + getId_menu() +
				"\nFecha: " + getFecha() +
				"\n\n";
	}
	
	// Getters y setters
	public String getDni_empleado() {
		return dni_empleado;
	}
	public void setDni_empleado(String dni_empleado) {
		this.dni_empleado = dni_empleado;
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
