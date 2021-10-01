/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.Homakesavadurgaprasad04lab;

/**
 *
 * @author Homakesavadurgaprasad OMTRI
 */
public class Elephant extends Animal {

    /**
     * This method is used to get the string from the parent class
     *
     * @param name Elephant
     */

    public Elephant(String name) {
        super(name);
    }

    /**
     * This is used to print name of the Animal
     *
     */

    public void speak() {
        System.out.println(" I'm an Elephant! ");
    }

    /**
     * This is used to print Animal food
     *
     */
    @Override
    public void eat() {
        System.out.println(" Grasses and sedges are my favourite food! ");
    }

    /**
     * This is used to print walking style of animal
     *
     */
    @Override
    public void move() {
        System.out.println(" I could not able to swim in water but would like to walk! ");
    }

}
