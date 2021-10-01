/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.nikhilporika04lab;

/**
 *
 * @author Nikhil Porika
 */
public class Dalmatian extends Animal {

    /**
     * Dalmatian Constructor
     *
     * @param name - the name of this is Dalmatian
     */
    public Dalmatian(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("I am Dalmatian I can run very fast");
    }

    @Override
    public void eat() {
        System.out.println("I am Dalmatian I can eat all the vegtables ");
    }

    @Override
    public void jump() {
        System.out.println("I am Dalmatian I can jump at very fall distance");
    }
}
