package edu.nwmissouri.zoo04lab;

/**
 * The class Griffin, a subclass of Animal
 *
 * @author Alexander Dieringer
 */
public class Griffin extends Animal {

    /**
     * Griffin constructor
     * Creates an instance of the Griffin class, requires a name
     * @param name The name we will be giving our new Griffin
     */
    public Griffin(String name) {
        super(name);
    }

    /**
     * speak() - Presents the types of sounds made by the Griffin
     */
    public void speak() {
        System.out.println("I'm a Griffin and I chirp like a bird, but I can "
                + "trumpet loudly if angry.");
    }

    /**
     * move() - Describes the general type of movement the animal Griffin
     */
    public void move() {
        System.out.println("I can walk but I really enjoy flying through the sky.");
    }
}
