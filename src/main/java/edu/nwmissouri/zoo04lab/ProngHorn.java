/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.csis;

/**
 *
 * @author S545229
 */
public class Pronghorn extends Animal {
    
     @Override
    public void speak()
    {
         System.out.println("I am Pronghorn");
    }
    @Override
    public void move()
    {
        System.out.println("I can walk");
    }
    
}
