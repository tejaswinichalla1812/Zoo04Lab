package edu.nwmissouri.zoo04lab;

/**
 * Floppy class (derived subclass of the superclass Animal)
 *
 * @author S545243 Satheesh Eppalapelli
 */
public class Floppy extends Animal {

    /**
     * Floppy constructor
     *
     * @param name - the name of this Floppy
     */
    public Floppy(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.printf("I'm an Floppy! I'm a pet of %s. \n", this.name);
    }

    @Override
    public void move() {
        System.out.println("When I move, I walk, walk, walk.");
    }

    /**
     *
     */
    public void location() {
        System.out.println("I live in water!");
    }

    /**
     *
     */
    public void character() {
        System.out.println("The Floppy Fish has a base of different shades of blue with yellow fins, and a yellow tail.");
    }

    /**
     *
     */
    public void confess() {
        double a = 3.5;
        int b = 3;
        double c = getFloppyAddition(a, b);
        System.out.printf("I know FloppyAddition! %4.2f plus %d is %4.2f \n", a, b, c);
    }

    /**
     * Custom Floppy function - your class must use a unique function name
     * unique first parameter identifier unique second parameter identifier do
     * something creative
     *
     * @param valueOne double input
     * @param valueTwo int input
     * @return double sum
     */
    public double getFloppyAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }

    public static void main(String[] args) {
        Floppy floppy = new Floppy("Satheesh");
        floppy.speak();
        floppy.move();
        floppy.location();
        floppy.character();
        floppy.confess();
    }
}
