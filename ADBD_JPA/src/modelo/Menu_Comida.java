package modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(MCKey.class)
@Table(name="MENU_COMIDA")
public class Menu_Comida {
	@Id
	@Basic(optional=false)
	private int id_menu;
	@Id
	@Basic(optional=false)
	private int id_comida;
	@Basic(optional=false)
	private int cantidad;
	
	@Override
	public String toString() {
		return 	"Menu: " + getId_menu() +
				"\nComida: " + getId_comida() +
				"\nCantidad: " + getCantidad() +
				"\n\n";
	}
	
	// Getters y setters
	public int getId_menu() {
		return id_menu;
	}
	public void setId_menu(int id_menu) {
		this.id_menu = id_menu;
	}
	public int getId_comida() {
		return id_comida;
	}
	public void setId_comida(int id_comida) {
		this.id_comida = id_comida;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
