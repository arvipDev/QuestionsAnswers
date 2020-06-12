package simple.problems;

public class Main {
    public static void main(String[] args) {
        //Question1 q1 = new Question1();
        //System.out.println(q1.isPalindrome(121));

        Question2 q2 = new Question2();
        System.out.println(q2.romanToInt("XXXIV"));
        System.out.println(q2.romanToInt("LVIII"));
        System.out.println(q2.romanToInt("IX"));
        System.out.println(q2.romanToInt("MCMXCIV"));
        System.out.println(q2.romanToInt("DCXXI"));
    }
}
