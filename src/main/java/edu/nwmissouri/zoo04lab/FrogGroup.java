package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 *
 * @author Manoj Kota
 */
public class FrogGroup {
    private static ArrayList<Frog> grp;
<<<<<<< HEAD
   public static int create()
=======

    /**
     *
     * @return
     * returns create method
     */
    public static int create()
>>>>>>> ee703a6e2485b405699ae92745dc350958e0f0ac
   {
       grp=new ArrayList<>();
       Frog f=new Frog("poison");
       grp.add(f);
       grp.add(new Frog("glass"));
       grp.add(new Frog("kaloula"));
       return grp.size();
   }
<<<<<<< HEAD
=======

    /**
     *
     *runs the Frog attributes
     */
>>>>>>> ee703a6e2485b405699ae92745dc350958e0f0ac
    public static void run()
   {
       System.out.println("My animal is Frog");
       grp.forEach(Frog->{
           Frog.speak();
           Frog.move();
           Frog.habitate();
           Frog.type();
           Frog.feeding();
           Frog.livespan();
    
           
       });
   }

   
<<<<<<< HEAD

=======
   
    
    
>>>>>>> ee703a6e2485b405699ae92745dc350958e0f0ac
}
