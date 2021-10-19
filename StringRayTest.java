package edu.nwmissouri.zoo04lab;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Saikrishna Vuppala
 */
public class StringRayTest {
    
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    
    public StringRayTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of swim method, of class StringRay.
     */
    /**
     * 
     * @throws Exception 
     */
    @Test
    public void testSwim() throws Exception{
        String expected = "Generic animal swim";
        var stringRay = new StringRay("sai");
        stringRay.swim();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);    
    }

    /**
     * Test of move method, of class StringRay.
     */
    /**
     * 
     * @throws Exception 
     */
    @Test
    public void testMove() throws Exception {
        String expected = "Generic animal movement";
        var stringRay = new StringRay("Sai");
        stringRay.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);   
    }

    /**
     * Test of speak method, of class StringRay.
     */
    @Test
    public void testSpeak() {
        String expected = "Generic animal voice";
        var stringRay = new StringRay("Sai");
        stringRay.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
    
}
