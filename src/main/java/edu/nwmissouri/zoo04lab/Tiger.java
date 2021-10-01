/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Saitej Veerabathini
 */
public class Tiger extends Animal{
    
    /***
     * Constructor for Tiger
     * @param name - the name of this Tiger
     */
    public Tiger(String name){
        super(name);
    }
    
    /***
     * Override method for Tiger Speak
     */
    @Override
    public void speak() {
        System.out.printf("I'm %s.I'm a Tiger\n", this.name);
    }
    
    /***
     * Override method for Tiger Move
     */
    @Override
    public void move() {
        System.out.println("I move on 4 legs");
    }
    
    /***
     * Override method for Tiger Diet
     */
    @Override
    public void diet() {
        System.out.println("I'm a Carnivore");
    }

    
}
