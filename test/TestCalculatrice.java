/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

/*import Exceptions.ArgumentException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;*/

import Services.Operation;

/**
 *
 * @author ordinateur
 */
public class TestCalculatrice {
    
    public TestCalculatrice() {
    }
   /* 
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }*/

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    /* @Test
    public void testAddition() {
        assertEquals(10, Operation.Addition(5, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(10, Operation.multiplication(5, 2));
    }

    @Test
    public void testDivision() {
        assertEquals(5, Operation.division(10, 2), 0.0001);
    }

    @Test
    public void testDivisionParZero() {
        assertThrows(ArgumentException.class, () -> {
            Operation.division(10,0);
        });
    }

    @Test
    public void testMultiplicationNull() {
       ArgumentException exception = assertThrows(ArgumentException.class, () -> {
            assertEquals(10, Operation.multiplication(5, null));
        });
        assertEquals("le second argument ne peut etre null", exception.getMessage());
    }*/
}
