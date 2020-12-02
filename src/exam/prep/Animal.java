package exam.prep;

public class Animal extends Vertebrate implements Mobility {

    public static void main(String[] args) {
        Vertebrate v = new Animal(6, "snow");
        v.origin();
    }

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
