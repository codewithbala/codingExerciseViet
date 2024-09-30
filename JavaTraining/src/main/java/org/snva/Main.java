package org.snva;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("String : abdcef");
        RevertString revertString = new RevertString();
        revertString.setStr("abdcef");
        String getrevertstring = revertString.revert();
        System.out.println("---------reverse :"+getrevertstring);

        System.out.println("Palindrome : abcdedcba");
        CheckPalindrome checkPalindrome = new CheckPalindrome();
        checkPalindrome.setStr("abcdedcba");
        System.out.println("---------"+checkPalindrome.palindrome());

        System.out.println("Factorial : 10");
        Factorial factorial = new Factorial();
        //factorial.factorialOf(10);
        System.out.println("---------"+factorial.factorialOf(10));


        System.out.println("Fiboncci : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,");
        Integer[] test= new Integer[]{0,1,1,2,3,5,8,13,21,34,55,89,144};
        Fibonacci fibonacci= new Fibonacci();
        int ind = fibonacci.FiboSeq(test);
        ind--;
        System.out.println("---------index of fibonacci : " + ind );
        //System.out.println("Fiboncci : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,");

        System.out.println("Fiboncci : 250 ");
       // Integer[] test= new Integer[]{0,1,1,2,3,5,8,13,21,34,55,89,144};
        GetFibonacciSeq getFibonacciSeq = new GetFibonacciSeq(250);
        List<Integer> lf = getFibonacciSeq.getSeq();
        System.out.println("---------Fibinacci Sequence : " + lf );

        System.out.println("Prime number :");
        PrimeNumber primeNumber=new PrimeNumber();
        System.out.println("---------1 Is a prime number : " + primeNumber.Isprime(1));

        System.out.println("5 first Prime number :");
        FirstPrimeNumber firstPrimeNumber=new FirstPrimeNumber();
        firstPrimeNumber.nfirstPrimeNumber(50);
 //       System.out.println("---------7 Is a prime number : " + primeNumber.Isprime(9));

        System.out.println("\nGreatest Common Number : 15, 35");
        GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
        System.out.println(greatestCommonDivisor.getGreatestCommonDivisor(15,35));


    }
}