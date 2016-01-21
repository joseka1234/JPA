package controlador;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main2 { 

    public static void main(String[] args) { 
        EntityManagerFactory emf = 
            Persistence.createEntityManagerFactory("ADBD_JPA"); 
        EntityManager em = emf.createEntityManager(); 
        EntityTransaction tx = em.getTransaction(); 
        
    	// Creamos la query (consulta).
        Query query = em.createQuery("SELECT I FROM Ingrediente_Proveedor I");
        
    	// 10 resultados como mucho.
        query.setMaxResults(10);
        
        // Obtenemos el vector de resultados de la BD.
    	List<String> list =  query.getResultList();
    	
    	// Imprimimos vector de resultados.
    	System.out.println(list);
        
        // Cerramos EntityManager y EntityManagerFactory para no consumir recursos.
        em.close(); 
        emf.close(); 
    }
    
}
