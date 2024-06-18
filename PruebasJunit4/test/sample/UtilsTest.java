package sample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas unitarias para la clase Utils.
 */
public class UtilsTest {
    
    public UtilsTest() {
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
     * Prueba para el método concatWords.
     */
    @Test
    public void testConcatWords() {
        System.out.println("Testing concatWords");
        String result = Utils.concatWords("Hello", " ", "world");
        assertEquals("Hello world", result);
    }

    /**
     * Prueba para el método computeFactorial.
     */
    @Test
    public void testComputeFactorial() {
        System.out.println("Testing computeFactorial");
        String result = Utils.computeFactorial(5);
        assertEquals("120", result);
    }

    /**
     * Prueba para el método computeFactorial con argumento inválido (0).
     */
    @Test
    public void testComputeFactorialWithZero() {
        System.out.println("Testing computeFactorial with zero");
        try {
            Utils.computeFactorial(0);
            fail("Expected IllegalArgumentException not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("zero or negative parameter (0)", e.getMessage());
        }
    }

    /**
     * Prueba para el método normalizeWord.
     */
    @Test
    public void testNormalizeWord() {
        System.out.println("Testing normalizeWord");
        String result = Utils.normalizeWord("cómo");
        assertEquals("cómo", result);
    }

    /**
     * Prueba para el método normalizeWord con argumento nulo.
     */
    @Test
    public void testNormalizeWordWithNull() {
        System.out.println("Testing normalizeWord with null");
        String result = Utils.normalizeWord(null);
        assertNull(result);
    }
    
}
