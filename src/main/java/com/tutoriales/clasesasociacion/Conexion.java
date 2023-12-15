/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutoriales.clasesasociacion;

/**
 *
 * @author sebastian-mac
 */
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexion {
	private static EntityManagerFactory emf ;
	public static EntityManager createEntityManager() {
	
	
		try {
			
			emf=Persistence.createEntityManagerFactory("persistencia");
			System.out.println("conectado!");
		
			
		}
		catch(Exception e) {System.out.println("Error en la conexion....  "+e);}
		
		
		return emf.createEntityManager();
	}
	
}

