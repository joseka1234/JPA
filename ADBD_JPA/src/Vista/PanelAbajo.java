package Vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controlador.Consultas;
import utils.VentanasEmergentes;

public class PanelAbajo extends JPanel {

	private List<String> menus;
	private JLabel informacion;
	private JComboBox menusDisponibles;
	private JButton boton;
	private Consultas consultas;
	private PanelSuperior auxPanel;

	public PanelAbajo(PanelSuperior panel) {
		setAuxPanel(panel);
		setConsultas(new Consultas());
		setMenus(new ArrayList<String>());
		setInformacion(new JLabel("Menús disponibles"));
		getInformacion().setHorizontalAlignment(JLabel.RIGHT);

		// Asignar menús en los menús
		setMenus(getConsultas().getMenus());

		setMenusDisponibles(new JComboBox());
		for (int i = 0; i < getMenus().size(); i++) {
			getMenusDisponibles().addItem(getMenus().get(i));
		}

		getMenusDisponibles().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String aux = "Comidas pertenecientes a este menu\n";
				List<String> auxList = getConsultas()
						.getComidasMenu(getMenusDisponibles().getSelectedItem().toString());
				int auxInt = 1;
				for (String comida : auxList) {
					aux += "Comida " + auxInt + ": " + comida + "\n";
					auxInt++;
				}
				PanelCentro.setTexto(aux);
			}
		});

		setBoton(new JButton("Pedir"));
		setLayout(new GridLayout(1, 3));

		getBoton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (PanelSuperior.isDniCorrecto()) {
					boolean log;
					java.util.Date fechaActual = new java.util.Date();
					Date actual = new Date(fechaActual.getYear(), fechaActual.getMonth(), fechaActual.getDay());
					log = getConsultas().addPacienteCome(getAuxPanel().getDni_paciente().getText(),
							getMenusDisponibles().getSelectedItem().toString(), actual); 
					if(log)
						VentanasEmergentes.mostrarInformacion("Se ha realizado el pedido", "Información");
					else {
						String cuerpo2 = "No se ha podido introducir el pedido";
						String titulo2 = "Error de insercion";
						VentanasEmergentes.mostrarError(cuerpo2, titulo2);
					}
				} else {
					String cuerpo = "Introduce un DNI de un paciente del hospital";
					String titulo = "ERROR, DNI incorrecto";
					VentanasEmergentes.mostrarError(cuerpo, titulo);
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
	private List<String> getMenus() {
		return menus;
	}

	/**
	 * @param menus
	 *            the menus to set
	 */
	private void setMenus(List<String> menus) {
		this.menus = menus;
	}

	/**
	 * @return the informacion
	 */
	private JLabel getInformacion() {
		return informacion;
	}

	/**
	 * @param informacion
	 *            the informacion to set
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
	 * @param boton
	 *            the boton to set
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
	 * @param menusDisponibles
	 *            the menusDisponibles to set
	 */
	private void setMenusDisponibles(JComboBox menusDisponibles) {
		this.menusDisponibles = menusDisponibles;
	}

	public Consultas getConsultas() {
		return consultas;
	}

	public void setConsultas(Consultas consultas) {
		this.consultas = consultas;
	}

	public PanelSuperior getAuxPanel() {
		return auxPanel;
	}

	public void setAuxPanel(PanelSuperior auxPanel) {
		this.auxPanel = auxPanel;
	}

}
