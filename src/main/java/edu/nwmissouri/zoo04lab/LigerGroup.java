package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Ligers
 *
 * @author Tejaswini Challa
 */
public class LigerGroup {

    private static ArrayList<Liger> myGroup;

    /**
     * Create a static group of Ligers
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        Liger l = new Liger("Tigon");
        myGroup.add(l);
        myGroup.add(new Liger("Panthera Leo"));
        myGroup.add(new Liger("Panthera Tigris"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the Liger!");
        myGroup.forEach(liger -> {
            liger.speak();
            liger.move();
        });
        System.out.println("Nice ligers - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

}
