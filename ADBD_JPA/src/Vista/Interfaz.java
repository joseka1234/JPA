package Vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Interfaz extends JFrame{
	private static final String TITULO = "Comedor de Hospital";
	private PanelSuperior panelSuperior;
	private PanelCentro panelCentro;
	private PanelAbajo panelAbajo;
	public Interfaz() {
		setSize(800, 600);
		setTitle(TITULO);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setPanelSuperior(new PanelSuperior ());
        setPanelAbajo(new PanelAbajo (getPanelSuperior()));
        setPanelCentro(new PanelCentro ());
        
        add (getPanelCentro(),  BorderLayout.CENTER);
        add (getPanelAbajo(), BorderLayout.SOUTH);
        add (getPanelSuperior(), BorderLayout.NORTH);
	}
	
	/**
	 * @return the panelSuperior
	 */
	private PanelSuperior getPanelSuperior() {
		return panelSuperior;
	}
	/**
	 * @param panelSuperior the panelSuperior to set
	 */
	private void setPanelSuperior(PanelSuperior panelSuperior) {
		this.panelSuperior = panelSuperior;
	}
	/**
	 * @return the panelCentro
	 */
	private PanelCentro getPanelCentro() {
		return panelCentro;
	}
	/**
	 * @param panelCentro the panelCentro to set
	 */
	private void setPanelCentro(PanelCentro panelCentro) {
		this.panelCentro = panelCentro;
	}
	/**
	 * @return the panelAbajo
	 */
	private PanelAbajo getPanelAbajo() {
		return panelAbajo;
	}
	/**
	 * @param panelAbajo the panelAbajo to set
	 */
	private void setPanelAbajo(PanelAbajo panelAbajo) {
		this.panelAbajo = panelAbajo;
	}
}
