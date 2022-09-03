/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.occ.edu.sv.ingenieria.prn335.guia02_2022.controller;

import ues.occ.edu.sv.ingenieria.prn335.guia02_2022.TipoDocumento;
import javax.persistence.EntityManager;


/**
 *
 * @author Kevin
 */
public class TipoDocumentoBean {
    public void insertarDoc(TipoDocumento doc){    
        EntityManager em = null;
        
        try {
            em = Conexion.createEntityManager();
            em.getTransaction().begin();
            em.persist(doc);
            em.getTransaction().commit();
            System.out.println("guardado correctamente");
            
        } catch (Exception e) {
            System.out.println("error al guardar "+e.getMessage());
        }finally{
            if (em!=null){
                em.close();
            }
        }
        
    }
    public static void main(String[]args){
        TipoDocumentoBean tdb =new TipoDocumentoBean();
        TipoDocumento doc =new TipoDocumento();
        doc.setIdTipoDocumento(Integer.MIN_VALUE);
        doc.setNombre("dui");
        doc.setExpresionRegular("2301204");
        doc.setActivo(false);
        tdb.insertarDoc(doc);
    }
}

