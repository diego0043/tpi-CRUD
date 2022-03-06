/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.baches.control;

import com.mycompany.baches.entity.resources.Estado;
import java.util.Date;
import javax.ejb.embeddable.EJBContainer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author J_Die
 */
public class EstadoBeanTest {
    
    public EstadoBeanTest() {
    }

    /**
     * Test of crear method, of class EstadoBean.
     */
    @org.junit.jupiter.api.Test
    public void testCrear() throws Exception {
        System.out.println("crear");
        Estado nuevo = new Estado();
        nuevo.setFechaCreacion(new Date());
        nuevo.setNombre("Creado desde prueba" + System.currentTimeMillis());
        EstadoBean instance = new EstadoBean();
        boolean expResult = false;
        boolean result = instance.crear(nuevo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
