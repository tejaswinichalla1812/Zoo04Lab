package edu.nwmissouri.Zoo04lab;

/**
 *
 * @author Naveen Kumar Kanaparthi
 */
public class ArizonaJaguar extends Animal {
    
    public ArizonaJaguar(String name) {
        super(name);
    }
    
    @Override
    public void talk(){
        System.out.printf("I am %s. I am Jaguar!", this.name);
    }
    
    @Override
    public void move(){
        System.out.println("When I move, I walk.\n");
    }
        
    @Override
     public void behaviour(){
        System.out.println("I am very aggressive and hunt alone");
    }
    }
