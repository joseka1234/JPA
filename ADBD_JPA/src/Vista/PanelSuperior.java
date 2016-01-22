package Vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import utils.VentanasEmergentes;

@SuppressWarnings("serial")
public class PanelSuperior extends JPanel{
	private JTextField dni_paciente;
	private JLabel informacion;
	private JButton boton;
	private static boolean dniCorrecto;
	private static String dni;

	public PanelSuperior () {
		setDniCorrecto(false);
		setInformacion(new JLabel ("DNI del paciente: "));
		getInformacion().setHorizontalAlignment(JLabel.RIGHT);
		setDni_paciente(new JTextField ());
		setBoton(new JButton("Comprobar"));
		setLayout(new GridLayout(1, 3));
		getBoton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/* TODO: 	SELECT count(*)
				 * 			FROM PACIENTE
				 * 			WHERE dni_paciente = getDni_paciente().getText();
				 * 
				 * 			Si count==1 setDniCorrecto (true);
				 * 			Si no, setDniCorrecto (false)
				 */

				if (isDniCorrecto()) {
					getDni_paciente().setBackground(Color.GREEN);
					setDni(getInformacion().getText());

				}
				else {
					VentanasEmergentes.mostrarError("DNI invalido", "Error");
				}
			}
		});
		Action sendAction = new AbstractAction("Send") {
			public void actionPerformed(ActionEvent e) {
				getBoton().doClick();
			}
		};
		getDni_paciente().setAction(sendAction);
		add(getInformacion());
		add(getDni_paciente());
		add(getBoton());
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
	 * @return the dni_paciente
	 */
	public JTextField getDni_paciente() {
		return dni_paciente;
	}
	/**
	 * @param dni_paciente the dni_paciente to set
	 */
	public void setDni_paciente(JTextField dni_paciente) {
		this.dni_paciente = dni_paciente;
	}

	/**
	 * @return the dniCorrecto
	 */
	public static boolean isDniCorrecto() {
		return dniCorrecto;
	}

	/**
	 * @param dniCorrecto the dniCorrecto to set
	 */
	private void setDniCorrecto(boolean dniCorrecto) {
		this.dniCorrecto = dniCorrecto;
	}

	/**
	 * @return the dni
	 */
	public static String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	private void setDni(String dni) {
		this.dni = dni;
	}
}
