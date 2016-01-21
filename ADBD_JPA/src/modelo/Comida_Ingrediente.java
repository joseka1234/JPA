package modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(CIKey.class)
@Table(name="COMIDA_INGREDIENTE")
public class Comida_Ingrediente {
	@Id
	@Basic(optional=false)
	private int id_comida;
	@Id
	@Basic(optional=false)
	private int id_ingrediente;
	@Basic(optional=false)
	private int cantidad;
	
	@Override
	public String toString() {
		return 	"Comida: " + getId_comida() +
				"\nIngrediente: " + getId_ingrediente() +
				"\nCantidad" + getCantidad() +
				"\n";
	}
	
	// Getters y setters
	public int getId_comida() {
		return id_comida;
	}
	public void setId_comida(int id_comida) {
		this.id_comida = id_comida;
	}
	public int getId_ingrediente() {
		return id_ingrediente;
	}
	public void setId_ingrediente(int id_ingrediente) {
		this.id_ingrediente = id_ingrediente;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}	
}
