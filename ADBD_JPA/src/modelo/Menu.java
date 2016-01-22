package modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MENU")
public class Menu extends Tabla  {
	@Id
	@Basic(optional=false)
	private int id_menu;
	@Basic(optional=false)
	private String nombre;
	
	@Override
	public String toString() {
		return 	"ID: " + getId_menu() +
				"\nNombre: " + getNombre() +
				"\n\n";
	}
	
	// Getters y settesr
	public int getId_menu() {
		return id_menu;
	}
	public void setId_menu(int id_menu) {
		this.id_menu = id_menu;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
}
