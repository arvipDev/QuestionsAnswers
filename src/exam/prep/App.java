package exam.prep;

public class App {
    public static void main(String[] args) {

        Bird sparrow = new Bird(1, "sky");
        Animal wolf = new Animal(6, "snow");
        // Instances have access to methods from both overriding methods of the interface and parent class
        sparrow.move();
        wolf.move();
        sparrow.origin();
        wolf.origin();

        //****************************************************************************************

        Vertebrate v1 = new Bird(5, "sea");
        Vertebrate v2 = new Animal(6, "tree");
        // Type casting a child to its parent - Methods defined in children are not accessible
        // Reference variable (in stack) is of the parent, object (in heap) is of children.
        v1.origin();
        v2.origin();

        //****************************************************************************************

        Mobility move = new Bird(3, "ground");
        Mobility move2 = new Animal(9, "pet");
        // Instantiating an interface and type casting it to its implementation to call the
        // defined interface method. (These methods are defined in implementing classes.)
        // Reference variable (in stack) is of interface, object (in heap) is of implementations.
        move.move();
        move2.move();


    }
}
