/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.VenkataPrabhakar04Lab;

/**
 *
 * @author Venkata Prabhakar Takkellapati
 */
public class Emu extends Animal {
    
    public Emu(String name) {
        super(name);
    }

    
    @Override
    public void speak() {
        System.out.println("This endangered species is native to the dense forests of the Congo!");
    }
    
    @Override
    public void move() {
        System.out.println("they've become rare in the wild.");
    }
     @Override
    public void look() {
        System.out.println("Though striped like a zebra, it’s actually a smaller cousin to the giraffe.");
    }
}
