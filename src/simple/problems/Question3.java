package simple.problems;

//      Find the total number of prime numbers within a given value "n"
//      Solution: 1) 2 methods, one to check if the number is prime and the other to call that method in a loop till n
//      2) Check for values till 3. If n <= 1, return false. If n <= 3, return true;
//      3) Check if the number is divisible by 2 or 3, if yes then return false.
//      4) Run a for loop from i = 5 to square root of n in increments of 6
//      5) Within the loop check if n is divisible by i or divisible by (i + 2), if yes then false.
//      6) If the method does not return within for loop, then return true outside the loop.

import java.util.Arrays;

public class Question3 {
    //Solution 1
/*    public int countPrimes(int n) {
        int count = 0;
        for (int i = 0; i < n; i++){
            if (isPrime (i)) {
                count++;
            }
        }
        return count;

    }
    private boolean isPrime (int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i*i <= n; i = i+6){
            if (n % i == 0 || n % (i+2) == 0) return false;
        }
        return true;
    }*/

    /*//Solution 1
    public int countPrimes(int n) {
        int count = 2;
        boolean isPrime[] = new boolean[n];
        //Arrays.fill(isPrime, true);
        if (n <= 2) return 0;
        if (n == 3) return 1;
        isPrime[0] = false;
        isPrime[1] = false;
        isPrime[2] = true;
        isPrime[3] = true;
        for (int i = 4; i < n; i++){
            if (i % 2 == 0 || i % 3 == 0) isPrime[i] = false;
            else {
                System.out.println(i + " i ");
                int tag = 0;
                for (int j = 5; j*j <= i; j = j + 6){
                    if (i % j == 0 || i % (j + 2) == 0) {
                        isPrime[i] = false;
                        tag = 1;
                    }
                }
                if (tag == 0) isPrime[i] = true;

            }
        }
        for (int i = 4; i < n; i++){
            if(isPrime[i]) count++;
            System.out.println(i + " i ");
            System.out.println(isPrime[i] );
        }
        return count;
    }*/

    //Solution 3 - Best algo - Sieve of Eratosthenes

    public int countPrimes(int n) {
        int count = 0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        for (int i = 2; i*i < n; i++){
            if (isPrime[i]) {
                for (int j = i*i; j < n; j += i){
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i < n; i++){
            if (isPrime[i]) count++;
        }
        return count;
    }
}
