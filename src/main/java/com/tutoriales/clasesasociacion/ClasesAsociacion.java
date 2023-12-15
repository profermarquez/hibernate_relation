/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tutoriales.clasesasociacion;

import DAO.EstudianteDAO;

/**
 *
 * @author sebastian-mac
 */
public class ClasesAsociacion {

    public static void main(String[] args) {
        EstudianteDAO ed = new EstudianteDAO();
        ed.create();
        System.out.println("Hello World!");
    }
}
