/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Pavan Kumar Atmakuri
 */
public class Bearcat extends Animal {
    
    public Bearcat(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println("I will climb trees :)");
    }

    @Override
    public void speak() {
         System.out.printf("I'm %s. I'm a Bearcat! \n", this.name);
    }
    
    
}
