/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 * This is the MightyLion class This class have move and speak method of Lion
 * @author Vijay Kumar Chunchu(S545712)
 */
public class MightyLion extends Animal {
     public MightyLion(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println("I will Walk and run");
    }

    @Override
    public void speak() {
         System.out.printf("I am %s Lion. I will roar.\n", this.name);
    }
     
     /*
      * creating enum method
      */
     public enum Months {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER;
    }
     
      public void profess() {
        double a = 2.5;
        int b = 2;
        double c = getMightyLionkAddition(a, b);
        System.out.printf("The MightyLionAddition is  %4.2f plus %d is %4.2f \n", a, b, c);
    }

  
       public static void main(String[] args) {
        var a = new MightyLion("Tester");
        a.speak();
        a.move();
        a.profess();
    }

    private double getMightyLionkAddition(double a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
