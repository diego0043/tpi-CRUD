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
public class ObjetoEstadoBeanTest {
    
    public ObjetoEstadoBeanTest() {
    }

    /**
     * Test of crear method, of class ObjetoEstadoBean.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        Integer id_estado = null;
        Long id_objeto = null;
        boolean actual = false;
        Date fecha = null;
        String observaciones = "";
        ObjetoEstadoBean instance = new ObjetoEstadoBean();
        instance.crear(id_estado, id_objeto, actual, fecha, observaciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class ObjetoEstadoBean.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Long id = null;
        ObjetoEstadoBean instance = new ObjetoEstadoBean();
        instance.buscar(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class ObjetoEstadoBean.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Long id = null;
        Integer id_estado = null;
        Long id_objeto = null;
        boolean actual = false;
        Date fecha = null;
        String observaciones = "";
        ObjetoEstadoBean instance = new ObjetoEstadoBean();
        instance.actualizar(id, id_estado, id_objeto, actual, fecha, observaciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class ObjetoEstadoBean.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Long id = null;
        ObjetoEstadoBean instance = new ObjetoEstadoBean();
        instance.eliminar(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
