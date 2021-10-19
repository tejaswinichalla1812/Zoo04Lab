/**
 * 
 */
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author ANURAG KOLLURU
 */
public class Dinosaur extends Animal {

    /**
     *
     * @param name - String
     */
    public Dinosaur(String name) {
        super(name);
    }
    enum level{
        sunday,
        monday,
        tuesday
    }
    
    /**
     * This method is used to print speak
     */

    @Override
    public void speak() {
        System.out.printf("i'm %s. I am a DINOSAURRRRR....!\n",this.name);
    }
    
    /**
     * This method is used to print move
     */

    @Override
    public void move() {
        System.out.println("I roam here and there");
    }
   public int area(int l,int b)
   {
            return  l*b;
    }   
   public void value(){
System.out.println("area"+area(3,2));
}
   public static void main(String[] args){
        Dinosaur  d=new Dinosaur("Red");
        d.speak();
        d.move();
        d.area(3,2);
        d.value();
        level l=level.sunday;
        level b=level.monday;
        level c=level.tuesday;
        System.out.println("weekdays"+l+"\n"+b+"\n"+c);
    
    
}
}