/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baches.control;

import com.mycompany.baches.entity.resources.TipoObjeto;
import java.io.Serializable;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author J_Die
 */
@Stateless
@LocalBean
public class TipoObjetoBean implements Serializable{
    @PersistenceContext(unitName = "Baches-PU")
    EntityManager em;
    
    public boolean crear(TipoObjeto e){
        if(e!=null && em!=null){
            em.persist(e);
        }
      return false ; 
    }
    
}