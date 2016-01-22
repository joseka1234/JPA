package modelo;

import java.sql.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="INGREDIENTE")
public class Ingrediente extends Tabla  {
	@Id
	@Basic(optional=false)
	private int id_ingrediente;
	@Basic(optional=false)
	private String nombre;
	@Basic(optional=false)
	private double calorias;
	@Basic(optional=false)
	private double grasas;
	@Basic(optional=false)
	private double hidratos_de_carbono;
	@Basic(optional=false)
	private double azucar;
	@Basic(optional=false)
	private double sodio;
	@Basic(optional=false)
	private boolean lactosa;
	@Basic(optional=false)
	private boolean gluten;
	@Basic(optional=false)
	private int cantidad;
	@Basic(optional=false)
	private Date fecha_caducidad;
	
	@Override
	public String toString() {
		return 	"ID: " + getId_ingrediente() +
				"\nNombre: " + getNombre() +
				"\nCalorias: " + getCalorias() +
				"\nGrasas: " + getGrasas() +
				"\nHidratos de carbono: " + getHidratos_de_carbono() +
				"\nAzucar: " + getAzucar() +
				"\nSodio: " + getSodio() +
				"\nLactosa: " + isLactosa() +
				"\nGluten: " + isGluten() +
				"\nCantidad: " + getCantidad() + 
				"\nFecha de caducidad: " + getFecha_caducidad() +
				"\n\n";
	}
	
	// Getters y setters
	public int getId_ingrediente() {
		return id_ingrediente;
	}
	public void setId_ingrediente(int id_ingrediente) {
		this.id_ingrediente = id_ingrediente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getCalorias() {
		return calorias;
	}
	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}
	public double getGrasas() {
		return grasas;
	}
	public void setGrasas(double grasas) {
		this.grasas = grasas;
	}
	public double getHidratos_de_carbono() {
		return hidratos_de_carbono;
	}
	public void setHidratos_de_carbono(double hidratos_de_carbono) {
		this.hidratos_de_carbono = hidratos_de_carbono;
	}
	public double getAzucar() {
		return azucar;
	}
	public void setAzucar(double azucar) {
		this.azucar = azucar;
	}
	public double getSodio() {
		return sodio;
	}
	public void setSodio(double sodio) {
		this.sodio = sodio;
	}
	public boolean isLactosa() {
		return lactosa;
	}
	public void setLactosa(boolean lactosa) {
		this.lactosa = lactosa;
	}
	public boolean isGluten() {
		return gluten;
	}
	public void setGluten(boolean gluten) {
		this.gluten = gluten;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Date getFecha_caducidad() {
		return fecha_caducidad;
	}
	public void setFecha_caducidad(Date fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}
	
	
	

}
