package Vista;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PanelCentro extends JPanel{

	private static JTextArea texto;
	
	public PanelCentro () {
		setTexto(new JTextArea ());
		JScrollPane scroll = new JScrollPane (getTexto());
		setLayout(new BorderLayout());
		add (scroll, BorderLayout.CENTER);
	}

	/**
	 * @return the texto
	 */
	private static JTextArea getTexto() {
		return texto;
	}

	/**
	 * @param texto the texto to set
	 */
	private void setTexto(JTextArea texto) {
		this.texto = texto;
	}
	
	/**
	 * Método que pone un texto en el JTextArea
	 * @param texto que se introduce en el JTextArea
	 */
	public static void setTexto (String texto) {
		getTexto().setText(texto);
	}
}
