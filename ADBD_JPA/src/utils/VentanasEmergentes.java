package utils;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanasEmergentes {

	/**
	 * Método que genera una ventana emergente de error con el título y el mensaje que se le pase.
	 * @param cuerpo mensaje que muestra la ventana emergente
	 * @param titulo título de la ventana emergente
	 */
	public static void mostrarError (String cuerpo, String titulo) {
		JOptionPane.showOptionDialog(new JPanel (), cuerpo, titulo, JOptionPane.ERROR_MESSAGE, 
				JOptionPane.ERROR_MESSAGE, null, new Object[]{" Cancelar "},"Cancelar");
	}
	
	/**
	 * Método que genera una ventana emergente de información con el título y el mensaje que se le pase.
	 * @param cuerpo mensaje que muestra la ventana emergente
	 * @param titulo título de la ventana emergente
	 */
	public static void mostrarInformacion (String cuerpo, String titulo) {
		JOptionPane.showOptionDialog(new JPanel (), cuerpo, titulo, JOptionPane.INFORMATION_MESSAGE, 
				JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
	}
}
