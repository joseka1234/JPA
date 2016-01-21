package modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMIDA")
public class Comida {
	@Id
	@Basic(optional=false)
	private int id_comida;
	@Basic(optional=false)
	private String nombre;
	
	@Override
	public String toString() {
		return 	"ID: " + getId_comida() +
				"\nNombre: " + getNombre() +
				"\n";
	}
	
	// Getters y setters
	public int getId_comida() {
		return id_comida;
	}
	public void setId_comida(int id_comida) {
		this.id_comida = id_comida;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
