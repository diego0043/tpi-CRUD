package com.mycompany.baches.control;

import com.mycompany.baches.entity.resources.Objeto;
import com.mycompany.baches.entity.resources.TipoObjeto;
import java.math.BigDecimal;
import javax.persistence.EntityManager;

/**
 *
 * @author J_Die
 */
public class ObjetoBean {

    EntityManager em = JPA_Util.getEntityManagerFactory().createEntityManager();

    public void crear(Integer id_tipo_objeto, BigDecimal longitud, BigDecimal latitud, String nombre, String observaciones) {

        Objeto objeto = new Objeto();
        TipoObjeto tipo_objeto = new TipoObjeto();

        tipo_objeto = em.find(TipoObjeto.class, id_tipo_objeto);

        objeto.setIdTipoObjeto(tipo_objeto);
        objeto.setLongitud(longitud);
        objeto.setLatitud(latitud);
        objeto.setNombre(nombre);
        objeto.setObservaciones(observaciones);

        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
    }

    public void buscar(Long id) {
        Objeto objeto = new Objeto();
        objeto = em.find(Objeto.class, id);

        if (objeto != null) {
            System.out.println(objeto);
        } else {
            System.out.println("No se encontro el objeto");
        }
    }

    public void actualizar(Long id, Integer id_tipo_objeto, BigDecimal longitud, BigDecimal latitud, String nombre, String observaciones) {
        Objeto objeto = new Objeto();
        objeto = em.find(Objeto.class, id);

        if (objeto != null) {
            TipoObjeto tipo_objeto = new TipoObjeto();

            tipo_objeto = em.find(TipoObjeto.class, id_tipo_objeto);

            objeto.setIdTipoObjeto(tipo_objeto);
            objeto.setLongitud(longitud);
            objeto.setLatitud(latitud);
            objeto.setNombre(nombre);
            objeto.setObservaciones(observaciones);

            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
        } else {
            System.out.println("No se encontro el objeto que desea actualizar");
        }
    }
    
    
    public void eliminar(Long id){
        Objeto objeto = new Objeto();
        objeto = em.find(Objeto.class, id);
        
        if(objeto != null){
            
            em.getTransaction().begin();
            em.remove(objeto);
            em.getTransaction().commit();
            
        }else{
            System.out.println("No se encontro el objeto a eliminar");
        }
    }

}
