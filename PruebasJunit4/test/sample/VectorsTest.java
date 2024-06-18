package sample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas unitarias para la clase Vectors.
 */
public class VectorsTest {
    
    public VectorsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        // Método de configuración de la clase de prueba (opcional)
    }
    
    @AfterClass
    public static void tearDownClass() {
        // Método de limpieza de la clase de prueba (opcional)
    }

    /**
     * Prueba para el método equal.
     */
    @Test
    public void testEqual() {
        System.out.println("Testing equal");

        // Caso de prueba: Vectores iguales
        int[] a1 = {1, 2, 3};
        int[] b1 = {1, 2, 3};
        assertTrue(Vectors.equal(a1, b1));

        // Caso de prueba: Vectores diferentes en longitud
        int[] a2 = {1, 2, 3};
        int[] b2 = {1, 2};
        assertFalse(Vectors.equal(a2, b2));

        // Caso de prueba: Vectores con valores diferentes
        int[] a3 = {1, 2, 3};
        int[] b3 = {1, 2, 4};
        assertFalse(Vectors.equal(a3, b3));

        // Caso de prueba: Vectores nulos (debería lanzar IllegalArgumentException)
        try {
            Vectors.equal(null, b1);
            fail("Expected IllegalArgumentException not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("null argument", e.getMessage());
        }
    }

    /**
     * Prueba para el método scalarMultiplication.
     */
    @Test
    public void testScalarMultiplication() {
        System.out.println("Testing scalarMultiplication");

        // Caso de prueba: Multiplicación escalar de vectores válidos
        int[] a1 = {1, 2, 3};
        int[] b1 = {4, 5, 6};
        int result1 = Vectors.scalarMultiplication(a1, b1);
        assertEquals(1*4 + 2*5 + 3*6, result1);

        // Caso de prueba: Vectores con longitud diferente (debería lanzar IllegalArgumentException)
        int[] a2 = {1, 2, 3};
        int[] b2 = {4, 5};
        try {
            Vectors.scalarMultiplication(a2, b2);
            fail("Expected IllegalArgumentException not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("different tuple of the vectors (3, 2)", e.getMessage());
        }

        // Caso de prueba: Vectores nulos (debería lanzar IllegalArgumentException)
        try {
            Vectors.scalarMultiplication(null, b1);
            fail("Expected IllegalArgumentException not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("null argument", e.getMessage());
        }
    }
}
