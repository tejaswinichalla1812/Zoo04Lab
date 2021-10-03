package edu.nwmissouri.zoo04lab;

/**
 *
 * @author ANURAG KOLLURU
 */
public class Dinosaur extends Animal {

    /**
     *
     * @param name - String
     */
    public Dinosaur(String name) {
        super(name);
    }
    
    /**
     * This method is used to print speak
     */

    @Override
    public void speak() {
        System.out.printf("i'm %s. I am a DINOSAURRRRR....!\n",this.name);
    }
    
    /**
     * This method is used to print move
     */

    @Override
    public void move() {
        System.out.println("I roam here and there");
    }
    
    /**
     * This method is used to print hunt
     */

    @Override
    public void hunt() {
        System.out.println("I hunt fresh animals");
    }
    
    /**
     * This method is used to print routine
     */
    
    @Override
    public void routine() {
        System.out.println("I EAT...SLEEP...AND RERPEAT..!");
    }

}
