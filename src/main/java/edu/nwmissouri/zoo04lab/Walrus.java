/*To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.naguruabdur04lab;

/**
 *
 * @author Rehaman Naguru Abdur
 */
public class Walrus extends Animal {

    //@param name
    public Walrus(String name) { // walrus constructor with parameter
        super(name);
    }

    public void intro() { // method
        System.out.println("I'm an Walrus");
    }

    @Override
    public void about() {  //method
        System.out.println("I am a sea animal");
    }

    @Override
    public void family() {//method
        System.out.println("I'm the only living species in the family Odobenidae and genus Odobenus.");
    }

    @Override
    public void location() { //method
        System.out.println("Mostly i live in Pacific ocean");
    }

}
