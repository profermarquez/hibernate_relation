/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutoriales.clasesasociacion.Models;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import java.io.Serializable;
import lombok.NoArgsConstructor;
/**
 *
 * @author sebastian-mac
 */
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="estudiante")
public class Estudiante  implements Serializable {
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int id;
    
    public String nombreyapellido;
   

    public Estudiante(String nombreyapellido){
        this.nombreyapellido = nombreyapellido;
    }
    
    
    
}
