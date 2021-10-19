/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo04lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Hari Hara Mummadi
 */
public class MuleDeerGroupTest {
    
    public MuleDeerGroupTest() {
    }

    /**
     * Test of create method, of class MuleDeerGroup.
     */
    @Test
    public void testCreate() {

    }

    /**
     * Test of run method, of class MuleDeerGroup.
     */
    @Test
    public void testRun() {
        int actual=3;
        int expected=Math.round(actual);
        assertEquals(actual,expected);
        
    }

}
