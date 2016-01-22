package utils;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanasEmergentes {

	/**
	 * M�todo que genera una ventana emergente de error con el t�tulo y el mensaje que se le pase.
	 * @param cuerpo mensaje que muestra la ventana emergente
	 * @param titulo t�tulo de la ventana emergente
	 */
	public static void mostrarError (String cuerpo, String titulo) {
		JOptionPane.showOptionDialog(new JPanel (), cuerpo, titulo, JOptionPane.ERROR_MESSAGE, 
				JOptionPane.ERROR_MESSAGE, null, new Object[]{" Cancelar "},"Cancelar");
	}
	
	/**
	 * M�todo que genera una ventana emergente de informaci�n con el t�tulo y el mensaje que se le pase.
	 * @param cuerpo mensaje que muestra la ventana emergente
	 * @param titulo t�tulo de la ventana emergente
	 */
	public static void mostrarInformacion (String cuerpo, String titulo) {
		JOptionPane.showOptionDialog(new JPanel (), cuerpo, titulo, JOptionPane.INFORMATION_MESSAGE, 
				JOptionPane.INFORMATION_MESSAGE, null, new Object[]{" OK "},"OK");
	}
}
