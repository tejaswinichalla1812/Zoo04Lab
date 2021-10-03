package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Aardvarks
 *
 * @author Denise Case
 */
public class AardvarkGroup {

    private static final ArrayList<Aardvark> myGroup = new ArrayList<Aardvark>();

    /**
     * Create a static group of Aardvarks
     */
    public static void create() {
        Aardvark a = new Aardvark("Abbie");
        myGroup.add(a);
        myGroup.add(new Aardvark("Boss"));
        myGroup.add(new Aardvark("Cass"));
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {

        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the aardvarks!");

        myGroup.forEach(aardvark -> {
            aardvark.speak();
            aardvark.move();
        });

        System.out.println("\nNice aardvarks - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");

    }

}
