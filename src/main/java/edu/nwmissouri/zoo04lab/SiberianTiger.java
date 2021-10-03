package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Mulamalla Akhil Kumar Reddy
 * 
 */
public class SiberianTiger extends Animal{
    
    /**
     * This is a constructor
     * @String name
     */
    public SiberianTiger (String name){
        super(name);
    }

    /*thi is roar method*/
    @Override
    public  void roar() {
        System.out.println("I'm a Tiger, my roar can be heard as far as 1.8 miles (3 km) away");
    }

    /*this is Run method*/
    @Override
    public void Run() {
        System.out.println("I can Run 80 kilometers per hour (km/h)");
    }

    /*this is sleep method */
    @Override
    public void sleep() {
        System.out.println("I can sleep 16hrs A/Day");
    }
    }
