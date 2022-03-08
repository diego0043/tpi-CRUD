/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.baches.control;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author J_Die
 */
public class ObjetoBeanTest {
    
    public ObjetoBeanTest() {
    }

    /**
     * Test of crear method, of class ObjetoBean.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        Integer id_tipo_objeto = null;
        BigDecimal longitud = null;
        BigDecimal latitud = null;
        String nombre = "";
        String observaciones = "";
        ObjetoBean instance = new ObjetoBean();
        instance.crear(id_tipo_objeto, longitud, latitud, nombre, observaciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class ObjetoBean.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Long id = null;
        ObjetoBean instance = new ObjetoBean();
        instance.buscar(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class ObjetoBean.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Long id = null;
        Integer id_tipo_objeto = null;
        BigDecimal longitud = null;
        BigDecimal latitud = null;
        String nombre = "";
        String observaciones = "";
        ObjetoBean instance = new ObjetoBean();
        instance.actualizar(id, id_tipo_objeto, longitud, latitud, nombre, observaciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class ObjetoBean.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Long id = null;
        ObjetoBean instance = new ObjetoBean();
        instance.eliminar(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
