package exam.prep;

public class Animal extends Vertebrate implements Mobility {

    public Animal(int age, String terrain) {
        super(age, terrain);
    }

    @Override
    public void move() {
        System.out.println("Moving on land");
    }

    @Override
    public void origin() {
        System.out.println("Since this is an animal, evolved to rule the land");
    }
}
