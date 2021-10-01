/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.rehana04lab;

/**
 *
 * @author Rehana Naguru
 */
public class HarpSeal extends Animal{
    /*
    HarpSeal Constructor 
    @param name -the name of this HarpSeal
    */
    public HarpSeal(String name){
        super(name);
    }
    
    
    public void funfacts(){
        System.out.println("I am HarpSeal, I am more migratory and I can travel more than 3100 miles.");
    }
    
    public void location(){
        System.out.println("I am native to northern part of Arctic Ocean and Atlantic Ocean.");
    } 
    
    public void food(){
        System.out.println("I eat many types of fish and invertibrates.");
    }
    
}

