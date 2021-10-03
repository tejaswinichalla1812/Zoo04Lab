/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Tejaswini Challa
 */
public class Liger extends Animal {
   public Liger(String name) 
   {
       super(name);
   }

    /**
     *
     */
    @Override
   public void speak()
    {
        System.out.println("I am an Liger "+this.name);
    }
   @Override
    public void size()
    {
        System.out.println("I am much larger than average tiger cub");
    }
   @Override
    public void place()
    {
        System.out.println("Exists in California");
    }
    
}
