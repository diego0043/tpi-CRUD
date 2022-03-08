
package com.mycompany.baches.control;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author J_Die
 */
public class JPA_Util {
    
    private static final String PERSISTENCE_UNIT_NAME = "Baches-PU";
    private static EntityManagerFactory factory;
    
    public static EntityManagerFactory getEntityManagerFactory(){
        if(factory == null){
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        return factory;
    }
    
    public static void shutdown(){
        if(factory!= null){
            factory.close();
        }
    }
    
}
