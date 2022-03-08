/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baches.control;

import com.mycompany.baches.entity.resources.TipoObjeto;
import java.util.Date;
import javax.persistence.EntityManager;

/**
 *
 * @author J_Die
 */
public class TipoObjetoBean {

    EntityManager em = JPA_Util.getEntityManagerFactory().createEntityManager();

    public void crear(boolean estado, Date fecha) {
        TipoObjeto tipo_objeto = new TipoObjeto();

        tipo_objeto.setActivo(estado);
        tipo_objeto.setFechaCreacion(fecha);

        em.getTransaction().begin();
        em.persist(tipo_objeto);
        em.getTransaction().commit();

    }

    public void buscar(Integer id) {
        TipoObjeto tipo_objeto = new TipoObjeto();

        tipo_objeto = em.find(TipoObjeto.class, id);
        if (tipo_objeto != null) {
            System.out.println(tipo_objeto);
        } else {
            System.out.println("No se encontro el registro");
        }
    }

    public void actualizar(Integer id, boolean estado, Date fecha) {
        TipoObjeto tipo_objeto = new TipoObjeto();
        tipo_objeto = em.find(TipoObjeto.class, id);

        if (tipo_objeto != null) {
            tipo_objeto.setActivo(estado);
            tipo_objeto.setFechaCreacion(fecha);

            em.getTransaction().begin();
            em.persist(tipo_objeto);
            em.getTransaction().commit();

        } else {
            System.out.println("No se encontro el registro a actualizar");
        }

    }

    public void eliminar(Integer id) {
        TipoObjeto tipo_objeto = new TipoObjeto();
        tipo_objeto = em.find(TipoObjeto.class, id);

        if (tipo_objeto != null) {
            em.getTransaction().begin();
            em.remove(tipo_objeto);
            em.getTransaction().commit();
        } else {
            System.out.println("No se encontro el registro a elminar");
        }
    }

}
