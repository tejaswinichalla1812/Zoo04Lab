
import edu.nwmissouri.zoo04lab.Animal;


/**
 *
 * @author Maneesh7
 */
public class Cat extends Animal {

    public Cat(String name) {
        super(name);

    }

    @Override
    public void speak() {
        System.out.println(" I am a Cat.. " + this.name);
    }

    @Override
    public void move() {
        System.out.println(" I can run faster");

    }
}
