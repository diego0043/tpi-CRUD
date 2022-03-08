/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baches.control;

import com.mycompany.baches.entity.resources.Ruta;
import java.util.Date;
import javax.persistence.EntityManager;

/**
 *
 * @author J_Die
 */
public class RutaBean {

    EntityManager em = JPA_Util.getEntityManagerFactory().createEntityManager();

    public void crear(String nombre, Date fecha, String observaciones) {

        Ruta ruta = new Ruta();

        ruta.setNombre(nombre);
        ruta.setFechaCreacion(fecha);
        ruta.setObservaciones(observaciones);

        em.getTransaction().begin();
        em.persist(ruta);
        em.getTransaction().commit();

    }

    public void buscar(Long id) {
        Ruta ruta = new Ruta();
        ruta = em.find(Ruta.class, id);

        if (ruta != null) {
            System.out.println(ruta);
        } else {
            System.out.println("No se encontro la ruta");
        }
    }

    public void actualizar(Long id, String nombre, Date fecha, String observaciones) {
        Ruta ruta = new Ruta();
        ruta = em.find(Ruta.class, id);

        if (ruta != null) {

            ruta.setNombre(nombre);
            ruta.setFechaCreacion(fecha);
            ruta.setObservaciones(observaciones);

            em.getTransaction().begin();
            em.persist(ruta);
            em.getTransaction().commit();
        } else {
            System.out.println("No se encontro el registro a eliminar");
        }
    }

    public void eliminar(Long id) {
        Ruta ruta = new Ruta();
        ruta = em.find(Ruta.class, id);

        if (ruta != null) {
            em.getTransaction().begin();
            em.remove(ruta);
            em.getTransaction().commit();

        } else {
            System.out.println("No se encontro la ruta a eliminar");
        }

    }
}
