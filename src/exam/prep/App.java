package exam.prep;

public class App {
    public static void main(String[] args) {

        testOne();
        //testTwo("We need to send category:books to the buyers and" +
        //        "look at category:cash for rewards, ignore category:message");
        //testThree();
        
    }

    // Interface, Super class, Child class example.
    public static void testOne  () {

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
        // Assigning child object to its parent reference - Methods defined in parent is not accessible
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

    // List all the categories in a given sentence.
    // Clue - categories are followed by the word "category:".
    public static void testTwo(String sentence) {

        while(true) {
            int start = 0;
            int end = 0;
            if (!sentence.contains("category")){
                break;
            }
            String print;
            start = sentence.indexOf("category") + 9;
            print = sentence.substring(start);
            end = print.indexOf(" ");
            if (end == -1) end = print.length();
            System.out.println(print.substring(0, end));
            sentence = print;
        }
    }

    public static void testThree () {
        String sent = "abcdefgh";
        System.out.print(" Front on ");
        for (int i = 0; i < sent.length(); i++){
            System.out.print(sent.charAt(i));
        }

        System.out.print(" Front on ");
        for (int i = 0; i < sent.length(); ++i){
            System.out.print(sent.charAt(i));
        }

        System.out.print(" From rear ");
        for (int i = sent.length() - 1; i > -1; i--){
            System.out.print(sent.charAt(i));
        }

        System.out.print(" From rear 2 ");
        for (int i = sent.length() - 1; i >= 0; --i){
            System.out.print(sent.charAt(i));
        }
    }
}
