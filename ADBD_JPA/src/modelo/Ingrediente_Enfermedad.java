package modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(IEKey.class)
@Table(name="INGREDIENTE_ENFERMEDAD")
public class Ingrediente_Enfermedad extends Tabla  {
	@Id
	@Basic(optional=false)
	private int id_ingrediente;
	@Id
	@Basic(optional=false)
	private int id_enfermedad;
	
	@Override
	public String toString() {
		return 	"Ingrediente: " + getId_ingrediente() +
				"\nEnfermedad: " + getId_enfermedad() +
				"\n\n";
	}
	
	// Getters y setters
	public int getId_ingrediente() {
		return id_ingrediente;
	}
	public void setId_ingrediente(int id_ingrediente) {
		this.id_ingrediente = id_ingrediente;
	}
	public int getId_enfermedad() {
		return id_enfermedad;
	}
	public void setId_enfermedad(int id_enfermedad) {
		this.id_enfermedad = id_enfermedad;
	}
}
