package Vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utils.VentanasEmergentes;

public class PanelAbajo extends JPanel{

	private ArrayList <String> menus;
	private JLabel informacion;
	private JComboBox menusDisponibles;
	private JButton boton;
	
	public PanelAbajo () {
		setMenus(new ArrayList <String> ());
		setInformacion (new JLabel ("Menús disponibles"));
		getInformacion().setHorizontalAlignment(JLabel.RIGHT);
		
		/* TODO:
		 * Aqui necesito que me guardes el nombre de los menús en el arrayList menus
		 * 
		 * 	SELECT name
		 * 	FROM MENU
		 * 
		 * Si te ves inspirado puedes comprobar que todos los menus que muestras 
		 * sean los que tienen ingredientes disponibles, pero vamos que no hace falta
		 */
		
		setMenusDisponibles(new JComboBox ());
		for (int i = 0; i < getMenus().size(); i++) {
			getMenusDisponibles().addItem(getMenus().get(i));
		}
		
		getMenusDisponibles().addActionListener (new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String aux = "";

				/* TODO:
				 * Aqui hacer una busqueda de todos las comidas del menu seleccionado:
				 * getMenusDisponibles().getSelectedItem().toString();
				 * 
				 * luego lo guardas todo en el string aux, formateado "bonito"
				 * 
				 * NOTA: no te preocupes por el tamaño hacia abajo o hacia los lados del texto,
				 * le puse un scroll al JTextArea de PanelCentro
				 * NOTA2: si quieres  y te ves con ganas puedes poner tambien los ingredientes, pero
				 * no es que haga falta con la comida va bien
				 */

				PanelCentro.setTexto (aux);
			}
		});
		
		setBoton(new JButton ("Pedir"));
		setLayout(new GridLayout(1, 3));
		
		getBoton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (PanelSuperior.isDniCorrecto()) {
					/* TODO:
					 * Insertar en la base de datos que:
					 * el dni: PanelSuperior.getDni() 
					 * se ha comido el menu: getMenusDisponibles().getSelectedItem().toString();
					 */
					
					/* TODO: una vez realizada la busqueda anterior, solo mostrar este mensaje de debajo
					 *  si se ha insertado la fila, si no mostrar el de error como abajo, en el else
					 */
					
					VentanasEmergentes.mostrarInformacion("Se ha realizado el pedido", "Información");
				}
				else {
					String cuerpo = "Introduce un DNI de un paciente del hospital";
					String titulo = "ERROR, DNI incorrecto";
					VentanasEmergentes.mostrarError (cuerpo, titulo);
				}
			}
		});
		
		add(getInformacion());
		add(getMenusDisponibles());
		add(getBoton());
	}
	
	
	/**
	 * @return the menus
	 */
	private ArrayList<String> getMenus() {
		return menus;
	}
	/**
	 * @param menus the menus to set
	 */
	private void setMenus(ArrayList<String> menus) {
		this.menus = menus;
	}
	/**
	 * @return the informacion
	 */
	private JLabel getInformacion() {
		return informacion;
	}
	/**
	 * @param informacion the informacion to set
	 */
	private void setInformacion(JLabel informacion) {
		this.informacion = informacion;
	}
	/**
	 * @return the boton
	 */
	private JButton getBoton() {
		return boton;
	}
	/**
	 * @param boton the boton to set
	 */
	private void setBoton(JButton boton) {
		this.boton = boton;
	}
	/**
	 * @return the menusDisponibles
	 */
	private JComboBox getMenusDisponibles() {
		return menusDisponibles;
	}
	/**
	 * @param menusDisponibles the menusDisponibles to set
	 */
	private void setMenusDisponibles(JComboBox menusDisponibles) {
		this.menusDisponibles = menusDisponibles;
	}
	
	
}
