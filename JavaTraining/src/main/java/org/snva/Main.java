package org.snva;

public class Main {
    public static void main(String[] args) {
        System.out.println("abdcef");
        RevertString revertString = new RevertString();
        revertString.setStr("abdcef");
        String getrevertstring = revertString.revert();
        System.out.println(getrevertstring);

        System.out.println("Palindrome : abcdedcba");
        CheckPalindrome checkPalindrome = new CheckPalindrome();
        checkPalindrome.setStr("abcdedcba");
        System.out.println(checkPalindrome.palindrome());

        System.out.println("Factorial : 10");
        Factorial factorial = new Factorial();
        //factorial.factorialOf(10);
        System.out.println(factorial.factorialOf(10));

    }
}