/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.Nikhil04lab;

/**
 *
 * @author Nikhil KrishnanVenkatesh
 */
public class Lion extends Animal {
    /**
     * Lion constructor
     * @param name - the name of this instance of an animal
     */
    
    public Lion(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println("I will roar and hunt animals");
    }

    @Override
    public void speak() {
         System.out.printf("I'm %s. I'm an Lion! \n", this.name);
    }   
}
