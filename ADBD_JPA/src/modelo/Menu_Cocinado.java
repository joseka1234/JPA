package modelo;

import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(MCoKey.class)
@Table(name="MENU_COCINADO")
public class Menu_Cocinado {
	@Id
	@Basic(optional=false)
	private String dni_empleado;
	@Id
	@Basic(optional=false)
	private int id_menu;
	@Id
	@Basic(optional=false)
	private Date fecha;
}
