package modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ENFERMEDAD")
public class Enfermedad {
	@Id
	@Basic(optional=false)
	private int id_enfermedad;
	@Basic(optional=false)
	private String nombre;
	
	@Override
	public String toString() {
		return 	"ID: " + getId_enfermedad() +
				"\nNombre: " + getNombre() +
				"\n\n";
	}
	
	// Getters y setters
	public int getId_enfermedad() {
		return id_enfermedad;
	}
	public void setId_enfermedad(int id_enfermedad) {
		this.id_enfermedad = id_enfermedad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}