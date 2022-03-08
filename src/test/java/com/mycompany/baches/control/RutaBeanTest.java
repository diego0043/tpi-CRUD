/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.baches.control;

import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author J_Die
 */
public class RutaBeanTest {
    
    public RutaBeanTest() {
    }

    /**
     * Test of crear method, of class RutaBean.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        String nombre = "";
        Date fecha = null;
        String observaciones = "";
        RutaBean instance = new RutaBean();
        instance.crear(nombre, fecha, observaciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class RutaBean.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Long id = null;
        RutaBean instance = new RutaBean();
        instance.buscar(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class RutaBean.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Long id = null;
        String nombre = "";
        Date fecha = null;
        String observaciones = "";
        RutaBean instance = new RutaBean();
        instance.actualizar(id, nombre, fecha, observaciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class RutaBean.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Long id = null;
        RutaBean instance = new RutaBean();
        instance.eliminar(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
