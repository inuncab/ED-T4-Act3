package Sample;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import sample.Utils;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase Utils.
 */
public class UtilsTest {

    public UtilsTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        // Configuración inicial de recursos para todas las pruebas en la clase.
        System.out.println("Configurando recursos de la clase...");
    }

    @AfterAll
    public static void tearDownClass() {
        // Limpieza después de todas las pruebas en la clase.
        System.out.println("Limpiando recursos de la clase...");
    }

    @BeforeEach
    public void setUp() {
        // Configuración inicial antes de cada prueba individual.
        System.out.println("Configurando antes de una prueba...");
    }

    @AfterEach
    public void tearDown() {
        // Limpieza después de cada prueba individual.
        System.out.println("Limpiando después de una prueba...");
    }

    @Test
    public void testConcatWords() {
        // Prueba para el método concatWords con palabras válidas.
        System.out.println("Probando concatWords");
        String[] words = {"Hola", "mundo"};
        String expected = "Holamundo";
        String result = Utils.concatWords(words);
        assertEquals(expected, result, "Las palabras concatenadas no coinciden con la salida esperada.");
    }

    @Test
    public void testComputeFactorial() {
        // Prueba para el método computeFactorial con un número positivo.
        System.out.println("Probando computeFactorial");
        int number = 5;
        String expected = "120"; // El factorial de 5 es "120".
        String result = Utils.computeFactorial(number);
        assertEquals(expected, result, "El factorial no coincide con la salida esperada.");
    }

    @Test
    public void testComputeFactorialZero() {
        // Prueba para el método computeFactorial con el número 0 (caso inválido).
        System.out.println("Probando computeFactorial con 0");
        int number = 0;
        assertThrows(IllegalArgumentException.class, () -> {
            Utils.computeFactorial(number);
        }, "Se esperaba una excepción IllegalArgumentException.");
    }

    @Test
    public void testNormalizeWord() {
        // Prueba para el método normalizeWord con una palabra mixta de mayúsculas y minúsculas.
        System.out.println("Probando normalizeWord");
        String word = "Prueba";
        String expected = "prueba"; // La palabra "Prueba" normalizada a minúsculas es "prueba".
        String result = Utils.normalizeWord(word);
        assertEquals(expected, result, "La palabra normalizada no coincide con la salida esperada.");
    }

    @Test
    public void testNormalizeWordEmpty() {
        // Prueba para el método normalizeWord con una cadena vacía.
        System.out.println("Probando normalizeWord con cadena vacía");
        String word = "";
        String expected = ""; // La cadena vacía debería seguir siendo una cadena vacía.
        String result = Utils.normalizeWord(word);
        assertEquals(expected, result, "La palabra normalizada no coincide con la salida esperada.");
    }
}
