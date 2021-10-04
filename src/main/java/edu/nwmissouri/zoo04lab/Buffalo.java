/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.Zoo04lab;

/**
 *
 * @author Bhaskar
 */
public class Buffalo extends Animal {

    /**
     * *
     * Constructor for Buffalo
     *
     * @param name - the name of this Buffalo
     */
    public Buffalo(String name) {
        super(name);
    }

    /**
     * *
     * Override method for buffalo diet
     */
    @Override
    public void diet() {
        System.out.println("I'm a Herbivore");
    }

    /**
     * *
     * Override method for buffalo family
     */
    @Override
    public void family() {
        System.out.println("I am from Bovidae family");
    }

    /**
     * *
     * Override method for buffalo lifespan
     */
    @Override
    public void lifespan() {
        System.out.println("My life span is 10-20 years");
    }

}
