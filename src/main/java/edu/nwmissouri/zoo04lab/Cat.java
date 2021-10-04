package edu.nwmissouri.Zoo04lab;

/**
 *
 * @author Maneesh7
 */

    public class Cat extends Animal{
    
    public Cat(String name){
        super(name);
    }
     @Override
    public void eat(){
        System.out.println(" I like drinking milk!!");
    }
    @Override
    public void speak(){
        System.out.println(" I am a Cat.. "+this.name);
    }
    @Override
    public void child(){
        System.out.println(" I can give birth to one child at once");
    }
     @Override
    public void color(){
        System.out.println("I can be in black, brown and white color ");
    }
}
