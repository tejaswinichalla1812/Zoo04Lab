/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo04lab;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Hari Hara Mummadi
 */
public class MuleDeerTest {
     private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public MuleDeerTest() {
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
     * Test of move method, of class MuleDeer.
     */
    @Test
    public void testMove() {
    }

    /**
     * Test of speak method, of class MuleDeer.
     */
    @Test
    public void testSpeak() throws Exception {
        String expected="I'm MuleD.I'm an Deer!";
        var play = new MuleDeer("MuleD");
        play.speak();
        String actual= outputStreamCaptor.toString().trim();
        assertEquals(actual,expected);
    }

    /**
     * Test of habitat method, of class MuleDeer.
     */
    @Test
    public void testHabitate() {
    }

    /**
     * Test of feed method, of class MuleDeer.
     */
    @Test
    public void testFeed() {
    }

    /**
     * Test of main method, of class MuleDeer.
     */
    @Test
    public void testMain() {
    }
    
}
