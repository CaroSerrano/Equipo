/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package futbol;

import java.sql.Statement;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CAROLINA
 */
public class EquipoTest {
    
    public EquipoTest() {
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
     * Test of mostrarEquipo method, of class Equipo.
     */
    @Test
    public void testMostrarEquipo() throws Exception {
        System.out.println("mostrarEquipo");
        int opcion2 = 0;
        Statement st = null;
        Equipo.mostrarEquipo(opcion2, st);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarEquipos method, of class Equipo.
     */
    @Test
    public void testMostrarEquipos() throws Exception {
        System.out.println("mostrarEquipos");
        Statement st = null;
        Equipo.mostrarEquipos(st);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
