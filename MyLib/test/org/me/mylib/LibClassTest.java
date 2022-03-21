/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.mylib;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pol
 */
public class LibClassTest {
    
    public LibClassTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of acrostic method, of class LibClass.
     */
    @Test
    public void testAcrostic() {
        System.out.println("Ejecutando prueba acrostic ");
        String[] args = {"loro","perro","gato","lombriz"};
        String expResult = "letb";
        String result = LibClass.acrostic(args);
        assertEquals("Valor Correcto o null ",expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
