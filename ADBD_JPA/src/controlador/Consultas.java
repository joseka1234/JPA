package controlador;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import modelo.Paciente_Come;

public class Consultas {

	private EntityManagerFactory emf;
	private EntityManager em;
	private EntityTransaction tx;

	private static final String QUERY_MENUS = "SELECT M.nombre FROM Menu M";

	private static final String QUERY_COMIDAS = "SELECT C.nombre " + "FROM Comida C, Menu_Comida MC "
			+ "WHERE C.id_comida = MC.id_comida AND MC.id_menu IN ( " + "SELECT M.id_menu FROM Menu M "
			+ "WHERE M.nombre = :menuName)";

	private static final String QUERY_ID_MENU = "SELECT M.id_menu FROM Menu M " + "WHERE M.nombre = :menuName";

	private static final String QUERY_COUNT = "SELECT COUNT(P.dni_paciente) FROM Paciente P "
			+ "WHERE P.dni_paciente = :dniPaciente";

	public Consultas() {
		setEmf(Persistence.createEntityManagerFactory("ADBD_JPA"));
		setEm(getEmf().createEntityManager());
		setTx(getEm().getTransaction());
	}

	public List<String> getMenus() {
		List<String> aux = new ArrayList<String>();
		aux = getEm().createQuery(QUERY_MENUS).getResultList();
		return aux;
	}

	public List<String> getComidasMenu(String menu) {
		List<String> aux = new ArrayList<>();
		aux = em.createQuery(QUERY_COMIDAS).setParameter("menuName", menu).getResultList();
		return aux;
	}

	public boolean addPacienteCome(String dni_paciente, String nombreMenu, Date fecha) {
		int id_menu = (int) getEm().createQuery(QUERY_ID_MENU).setParameter("menuName", nombreMenu).getSingleResult();

		Paciente_Come paciente_come = new Paciente_Come();
		paciente_come.setDni_paciente(dni_paciente);
		paciente_come.setId_menu(id_menu);
		paciente_come.setFecha(fecha);

		getTx().begin();
		try {
			getEm().persist(paciente_come);
			getTx().commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public long existeDni(String dniPaciente) {
		long countDNI = (long) getEm().createQuery(QUERY_COUNT).setParameter("dniPaciente", dniPaciente)
				.getSingleResult();
		return countDNI;

	}

	public void close() {
		emf.close();
		em.close();
	}

	// Getters y setters
	public EntityManagerFactory getEmf() {
		return emf;
	}

	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public EntityTransaction getTx() {
		return tx;
	}

	public void setTx(EntityTransaction tx) {
		this.tx = tx;
	}

}
