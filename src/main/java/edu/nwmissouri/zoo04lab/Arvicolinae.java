package edu.nwmissouri.zoo04lab;
/**
 *
 * @author NIKHIL KUMAR AKARAPU
 */
public class Arvicolinae extends Animal{
    /* Arvicolinae constructor
    *@param name- the name of this Arvicolinae
    */
    public Arvicolinae(String name){
        super(name);
    }
    @Override
    public void speak() {
        System.out.println("I'm an Arvicolinae!");
    }
    @Override
    public void move() {
        System.out.println("When I move, I walk, walk, walk.");
    } 
}
