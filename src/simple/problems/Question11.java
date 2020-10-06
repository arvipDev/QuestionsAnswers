package simple.problems;

// Given a 32-bit signed integer, reverse digits of an integer.
// Note: Assume we are dealing with an environment that could only store integers within the
// 32-bit signed integer range: [−231,  231 − 1].
// For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

// Solution - If all digits of reversed integer is more than the digits of MAX integer, return 0;
//            If all digits except the last digit of reversed integer is equal to the digits of MAX integer and
//            the last digit is more than MAX_VALUE % 10, return 0.
//                      OR
//            If permitted to use long, used long to reverse the integer and compare it with Integer.MAX_VALUE and
//            Integer.MIN_VALUE - convert long to int and return the value.

public class Question11 {
    public static void main(String[] args) {
        Question11 q11 = new Question11();
        System.out.println(q11.reverse(123));
        System.out.println(q11.reverse(-123));
        System.out.println(q11.reverse(120));
        System.out.println(q11.reverse(1534236469));
        System.out.println(q11.reverse(-2147483412));
        System.out.println(q11.reverse(-2147483648));

    }
    public int reverse(int x) {
        int reverse = 0;
        int current = 0;
        int counter = 0;

        while(x != 0) {
            current = x % 10;

            if (counter > 8) {
                if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && current > Integer.MAX_VALUE % 10)) return 0;
                if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && current < -8)) return 0;
            }
            reverse *= 10;
            reverse += current;
            x /= 10;
            counter++;
        }
        return reverse;
    }

    // Solution using type long instead of int.
/*    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }

        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)res;
        }
    }*/
}
