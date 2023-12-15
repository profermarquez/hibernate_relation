/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.tutoriales.clasesasociacion.Conexion;
import com.tutoriales.clasesasociacion.Models.Estudiante;
import javax.persistence.EntityManager;

/**
 *
 * @author sebastian-mac
 */
public class EstudianteDAO {
    public String create() {
        EntityManager em= null;
        Estudiante usuario =new Estudiante("Juan Perez");
        
		try {
			em =Conexion.createEntityManager();
			//if(em == null){System.out.println("Error..");return;}
			em.getTransaction().begin();
			em.persist(usuario);
			em.getTransaction().commit();
			//System.out.println("Estudiante guardado");
		}
		catch(Exception e) {System.out.println(e);}
		finally {
			if(em!=null ) {
				
				em.close();
			}
		}
                return "Estudiante creado!";
    }
    
}
