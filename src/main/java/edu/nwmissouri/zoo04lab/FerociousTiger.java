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
public class FerociousTigerTiger extends Animal{
    
    /***
     * Constructor for FerociousTiger
     * @param name - the name of this FerociousTiger
     */
    public FerociousTiger(String name){
        super(name);
    }
    
    /***
     * Override method for FerociousTiger Speak
     */
    @Override
    public void speak() {
        System.out.printf("I'm %s.I'm a Tiger\n", this.name);
    }
    
    /***
     * Override method for FerociousTiger Move
     */
    @Override
    public void move() {
        System.out.println("I move on 4 legs");
    }
    
   

    
}
