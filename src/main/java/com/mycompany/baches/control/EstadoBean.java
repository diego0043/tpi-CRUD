package com.mycompany.baches.control;

import com.mycompany.baches.entity.resources.Estado;
import java.util.Date;
import javax.persistence.EntityManager;

/**
 *
 * @author J_Die
 */

public class EstadoBean {
    
    
    EntityManager em = JPA_Util.getEntityManagerFactory().createEntityManager();
   
    public void crear(String nombre, Date fecha, String Observaciones){
        Estado estado = new Estado();
        estado.setNombre(nombre);
        estado.setFechaCreacion(fecha);
        estado.setObservaciones(Observaciones);
        
        em.getTransaction().begin();
        em.persist(estado);
        em.getTransaction().commit();
        
    }
    
    
    public void buscar(int id){
            
        Estado estado = new Estado();
        estado = em.find(Estado.class, id);
        
        if (estado != null){
            System.out.println(estado);
            
        }else{
            System.out.println("El estado no se encontro");
        }  
    }
    
    public void actualizar(int id, String nombre, Date fecha, String Observaciones){
        
        Estado estado = new Estado();
        estado = em.find(Estado.class, id);
        if(estado != null){
            
            estado.setNombre(nombre);
            estado.setFechaCreacion(fecha);
            estado.setObservaciones(Observaciones);
            
            em.getTransaction().begin();
            em.merge(estado);
            em.getTransaction().commit();
            
        }else{
            System.out.println("El estado no se encontro para actualizar");
        }
        
    }
    
    
    public void eliminar(int id){
        
        Estado estado = new Estado();
        estado = em.find(Estado.class, id);
        
        if(estado != null){
            em.getTransaction().begin();
            em.remove(estado);
            em.getTransaction().commit();
        }else{
            System.out.println("El estado no se encontro para eliminarlo");
        }
        
    }
    
}
