/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.occ.edu.sv.ingenieria.prn335.guia02_2022.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Kevin
 */
public class Conexion {
    private static EntityManagerFactory emf=null;
    public static EntityManager createEntityManager(){
        try {
            if (emf==null){
                emf= Persistence.createEntityManagerFactory("bolsaPU");
            }
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return emf.createEntityManager();
        
            
        
    }
}
