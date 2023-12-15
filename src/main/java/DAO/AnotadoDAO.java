/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.tutoriales.clasesasociacion.Conexion;
import com.tutoriales.clasesasociacion.Models.Anotado;
import javax.persistence.EntityManager;

/**
 *
 * @author sebastian-mac
 */
public class AnotadoDAO {
    EntityManager em= null;

    public String create() {
        Anotado usuario =new Anotado();
        
		try {
			em =Conexion.createEntityManager();
			//if(em == null){System.out.println("Error..");return;}
			em.getTransaction().begin();
			em.persist(usuario);
			em.getTransaction().commit();
			//System.out.println("Anotado guardado");
		}
		catch(Exception e) {System.out.println(e);}
		finally {
			if(em!=null ) {
				
				em.close();
			}
		}
                return "Anotado creado!";
    }
    
    /*
    public String deleteUsuario(int id) {
        Usuario usuario =new Usuario();
        
		try {
			em =Conexion.createEntityManager();
			
			em.getTransaction().begin();
                        
                        usuario =em.find(Usuario.class, id);
                        if(usuario != null ){em.remove(usuario);}else{return "Usuario no encontrado";}
			em.getTransaction().commit();
			
		}
		catch(Exception e) {System.out.println(e);}
		finally {
			if(em!=null ) {
				
				em.close();
			}
		}
                return "Usuario eliminado!";
    }

    public String updateUsuario(int id, String text, String text0, String text1) {
        Usuario usuario =new Usuario(text,text0,text1);
        
		try {
			em =Conexion.createEntityManager();
			
			em.getTransaction().begin();
                        String sql= "UPDATE usuarios SET nombre = '"+text+"', apellido = '"+text0+"', direccion='"+text1+"' WHERE id = "+String.valueOf(id);
                        System.out.println(sql);
                        int countUpdated = em.createNativeQuery(sql).executeUpdate();
                        if(countUpdated!=1){return "Error";} /// si es correcto da uno
			em.getTransaction().commit();
		}
		catch(Exception e) {System.out.println(e);}
		finally {
			if(em!=null ) {
				
				em.close();
			}
		}
                return "Usuario modificado!";
    }

    public List<Usuario> getUsuarios() {
        List<Usuario> listEmployee=null;
        try {
			em =Conexion.createEntityManager();
			em.getTransaction().begin();
			listEmployee = em.createNativeQuery("SELECT id,nombre,direccion,apellido FROM usuarios", Usuario.class).getResultList();
			em.getTransaction().commit();
		}
		catch(Exception e) {System.out.println(e);}
		finally {
			if(em!=null ) {
				
				em.close();
			}
		}
                return listEmployee;
        
    }
    */
    
}
