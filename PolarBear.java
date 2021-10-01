/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.Maddelavedu04lab;

/**
 *
 * @author Maddelavedu Pravallika
 */
public class PolarBear extends Animal {
    
     public PolarBear(String name) {
       super(name); 
    }
    
    @Override
    public void move() {
        System.out.println(" Its head from side to side when it wants to play with another");
    }
    
    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm an polarBear! \n",this.name);
    }
    
    
}
