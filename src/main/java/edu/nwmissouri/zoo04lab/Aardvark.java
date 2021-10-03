package edu.nwmissouri.zoo04lab;

/**
 * Aardvark class (derived subclass of the superclass Animal)
 * 
 * @author Dr. Case
 */
public class Aardvark extends Animal {

    /**
     * Aardvark constructor 
     * @param name - the name of this aardvark
     */
    public Aardvark(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm an Aardvark!", this.name);
    }

    @Override
    public void move() {
        System.out.println("When I move, I walk, walk, walk.");
    }

}
