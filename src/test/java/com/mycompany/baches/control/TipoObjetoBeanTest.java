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
public class TipoObjetoBeanTest {
    
    public TipoObjetoBeanTest() {
    }

    /**
     * Test of crear method, of class TipoObjetoBean.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        boolean estado = false;
        Date fecha = null;
        TipoObjetoBean instance = new TipoObjetoBean();
        instance.crear(estado, fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class TipoObjetoBean.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Integer id = null;
        TipoObjetoBean instance = new TipoObjetoBean();
        instance.buscar(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class TipoObjetoBean.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Integer id = null;
        boolean estado = false;
        Date fecha = null;
        TipoObjetoBean instance = new TipoObjetoBean();
        instance.actualizar(id, estado, fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class TipoObjetoBean.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Integer id = null;
        TipoObjetoBean instance = new TipoObjetoBean();
        instance.eliminar(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
