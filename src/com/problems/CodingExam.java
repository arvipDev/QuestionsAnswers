package com.problems;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodingExam {
    public static void main(String[] args) {
        Set < String > dictionary = new HashSet < String > ();
        String s = new String();
        s = "hellonow";

        dictionary.add("hello");
        dictionary.add("hell");
        dictionary.add("on");
        dictionary.add("now");

        test6(dictionary, s);
    }

    public static int test(int[] input){
        int head = 0;
        int tail = input.length - 1;
        int smallestSum = input[head] + input[tail--];
        while (!(head == tail)){
            int temp = input[head] + input[tail];
            if (smallestSum > temp && temp > 0){
                smallestSum = temp;
                tail--;
            } else if (smallestSum < temp && temp > 0){
                tail--;
            } else head++;
        }
        return smallestSum;
    }

    public static String test7 (String input) {
        String[] words = input.split(" ");
        Stack<String> rev = new Stack<>();
        for (String word : words){
            rev.push(word);
        }
        String revWords = "";
        while (!rev.isEmpty()){
            revWords = revWords.concat(rev.pop() + " ");
        }
        return revWords;
    }

    public static void test3() {
        String string = "Name";
        string = string.concat(" : Arvind"); // strings are immutable so equating is necessary
        System.out.println(string);
        string = string.substring(0, 7);    // 0 is inclusive, 7 is exclusive
        System.out.println(string);
        string = string.replace(" ", "_"); // replace all occurance of " " with "_"
        System.out.println(string);
        string = "Name : Arvind";
        string = string.toLowerCase().replace("a", "A");
        System.out.println(string);
        string = string.toLowerCase().replaceAll("A", "a");
        System.out.println(string);
        int index = string.indexOf("r");
        System.out.println(index);
        System.out.println(string.startsWith("m"));
        string = "Arvind@Purushotham.com";
        //arvind.purushotham@gmail.com
        String[] split = string.split("@");
        String[] split2 = string.split("\\.");
        System.out.println(Arrays.toString(split));
        System.out.println(Arrays.toString(split2));
    }

    public static void test4() {
        Integer[] values = {1 ,2, 3, 4, 5, 6, 7};
        List<Integer> list = Arrays.asList(values);
        for (int va : list){
            System.out.println(va);
        }
    }

    public static void test6(Set<String> arr, String input) {
        boolean headMatch = false;
        boolean tailMatch = false;
        for (String s : arr){
            Pattern pattern = Pattern.compile("^" + s);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) headMatch = true;
/*            while (matcher.find()){
                System.out.println(matcher.start() + " " + matcher.end());
            }*/
            pattern = Pattern.compile(s + "$");
            matcher = pattern.matcher(input);
            if (matcher.find()) tailMatch = true;

            if (headMatch && tailMatch){
                System.out.println("Yessss");
                return;
            }
        }

    }

    public static boolean test5(){
        Queue<BinaryTreeNode> queue = new ArrayDeque<>();
        queue.add(new BinaryTreeNode(12, new BinaryTreeNode(9, null, null), new BinaryTreeNode(13, null, null)));
        queue.add(new BinaryTreeNode(10, null, null));
        System.out.println(queue.poll().data);
        System.out.println(queue.poll().data);
        while (!queue.isEmpty()){
            BinaryTreeNode tree = queue.poll();
            if (tree.left != null && tree.right != null){
                if ( tree.left.data > tree.right.data) {
                    return false;
                } else {
                    queue.add(tree.left);
                    queue.add(tree.right);
                }
            }
        }
        return true;
    }

    static class BinaryTreeNode{
        int data;
        BinaryTreeNode left = null;
        BinaryTreeNode right = null;
        BinaryTreeNode (int data, BinaryTreeNode left, BinaryTreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static void test2() {
        Pattern pattern = Pattern.compile("\\d{10}");
        Matcher matcher = pattern.matcher("1234567890");
        System.out.println(matcher.matches());
        matcher = pattern.matcher("123456789012");
        System.out.println(matcher.matches());

        pattern = Pattern.compile("\\d{10,15}");
        matcher = pattern.matcher("123456789012345");
        System.out.println(matcher.matches());

        pattern = Pattern.compile("a{2}");
        matcher = pattern.matcher("aamnn");
        System.out.println(matcher.matches());

        pattern = Pattern.compile("[a-zA-Z]+\\.?");
        matcher = pattern.matcher("sfkuvbeirushfvolsinfzvioaergascasc");
        System.out.println(matcher.matches());


        pattern = Pattern.compile("([A-Za-z])+( [A-Za-z]+)*");
        matcher = pattern.matcher("sfkuvbeirushfvolsinfz vioaerg vioaerg vioaerg vioaerg");
        System.out.println(matcher.matches());

        //valid pwd
        pattern = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%]).{6,15})");
        matcher = pattern.matcher("NHc09!1w2");
        System.out.println(matcher.matches());

        //valid pwd
        pattern = Pattern.compile("((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%]).{6,15})");
        matcher = pattern.matcher("NHc09!12dfw21w2");
        System.out.println(matcher.matches());

        pattern = Pattern.compile("^[a-zA-Z0-9]+$");
        matcher = pattern.matcher("2009NHc");
        System.out.println(matcher.matches());
    }
}
