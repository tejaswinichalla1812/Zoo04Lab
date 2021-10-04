package edu.nwmissouri.saikrishna04lab;

/**
 *
 * @author Saikrishna Vuppala
 */
public class StringRay extends Animal {
    /**
     * 
     * @param name 
     */

    public StringRay(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Generic animal swim");
    }

    @Override
    public void move() {
        System.out.println("Generic animal movement");
    }

}
