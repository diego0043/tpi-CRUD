/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baches.control;

import com.mycompany.baches.entity.resources.Estado;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author J_Die
 */
@Stateless
@LocalBean
public class EstadoBean {
   
    public boolean crear(Estado nuevo){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Baches-PU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        try{
            tx.begin();
            em.persist(nuevo);
            tx.commit();
        }catch(Exception ex){
            tx.rollback();
        }
      return false ; 
    }
    
}
