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
public class EstadoBeanTest {
    
    public EstadoBeanTest() {
    }

    /**
     * Test of crear method, of class EstadoBean.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        String nombre = "";
        Date fecha = null;
        String Observaciones = "";
        EstadoBean instance = new EstadoBean();
        instance.crear(nombre, fecha, Observaciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class EstadoBean.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        int id = 0;
        EstadoBean instance = new EstadoBean();
        instance.buscar(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class EstadoBean.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        int id = 0;
        String nombre = "";
        Date fecha = null;
        String Observaciones = "";
        EstadoBean instance = new EstadoBean();
        instance.actualizar(id, nombre, fecha, Observaciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class EstadoBean.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        int id = 0;
        EstadoBean instance = new EstadoBean();
        instance.eliminar(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
