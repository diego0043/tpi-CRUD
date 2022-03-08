/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baches.control;

import com.mycompany.baches.entity.resources.Estado;
import com.mycompany.baches.entity.resources.Objeto;
import com.mycompany.baches.entity.resources.ObjetoEstado;
import java.util.Date;
import javax.persistence.EntityManager;

/**
 *
 * @author J_Die
 */
public class ObjetoEstadoBean {

    EntityManager em = JPA_Util.getEntityManagerFactory().createEntityManager();

    public void crear(Integer id_estado, Long id_objeto, boolean actual, Date fecha, String observaciones) {

        Estado estado = new Estado();
        Objeto objeto = new Objeto();
        ObjetoEstado obj_estado = new ObjetoEstado();

        estado = em.find(Estado.class, id_estado);
        objeto = em.find(Objeto.class, id_objeto);

        if (estado != null && objeto != null) {

            obj_estado.setIdObjeto(objeto);
            obj_estado.setIdEstado(estado);
            obj_estado.setActual(actual);
            obj_estado.setFechaAlcanzado(fecha);
            obj_estado.setObservaciones(observaciones);

            em.getTransaction().begin();
            em.persist(obj_estado);
            em.getTransaction().commit();

        } else {
            System.out.println("Algo salio mal");
        }

    }

    public void buscar(Long id) {
        ObjetoEstado obj_estado = new ObjetoEstado();

        obj_estado = em.find(ObjetoEstado.class, id);

        if (obj_estado != null) {
            System.out.println(obj_estado);
        } else {
            System.out.println("No se encontro el registro");
        }
    }

    public void actualizar(Long id, Integer id_estado, Long id_objeto, boolean actual, Date fecha, String observaciones) {
        ObjetoEstado obj_estado = new ObjetoEstado();
        obj_estado = em.find(ObjetoEstado.class, id);

        if (obj_estado != null) {
            
            Estado estado = new Estado();
            Objeto objeto = new Objeto();

            estado = em.find(Estado.class, id_estado);
            objeto = em.find(Objeto.class, id_objeto);

            if (estado != null && objeto != null) {

                obj_estado.setIdObjeto(objeto);
                obj_estado.setIdEstado(estado);
                obj_estado.setActual(actual);
                obj_estado.setFechaAlcanzado(fecha);
                obj_estado.setObservaciones(observaciones);

                em.getTransaction().begin();
                em.persist(obj_estado);
                em.getTransaction().commit();

            } else {
                System.out.println("Algo salio mal");
            }
        } else {
            System.out.println("No se emcontro el registro a actualizar");
        }
    }
    
    public void eliminar(Long id){
        ObjetoEstado obj_estado = new ObjetoEstado();
        
        obj_estado = em.find(ObjetoEstado.class, id);
        
        if(obj_estado != null){
            
            em.getTransaction().begin();
            em.remove(obj_estado);
            em.getTransaction().commit();
        }else{
            System.out.println("No se encontro el registro a eliminar");
        }
        
    }
}
