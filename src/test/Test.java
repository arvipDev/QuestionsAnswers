package test;

public class Test {
    public static void main(String[] args) {
        int[] cou = new int[26];
        String input = "sdhbvskbdvjssvdsfrg";
        for (int i = 0; i < input.length(); i++){
            cou[input.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++){
            System.out.println(cou[i]);
        }
    }
}
