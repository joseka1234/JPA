package modelo;

import java.io.Serializable;
import java.sql.Date;

public class MVKey implements Serializable {
	private static final long serialVersionUID = 1L;
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	int id_menu;
	String dni_voluntario;
	Date fecha;
}
