/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
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
 * @author Hari Hara Mummadi
 */
public class MuleDeerTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public MuleDeerTest() {
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
        String expected="I am a MuleDeer...MuleD";
        var play = new MuleDeer("MuleD");
        play.speak();
        String actual= outputStreamCaptor.toString().trim();
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
