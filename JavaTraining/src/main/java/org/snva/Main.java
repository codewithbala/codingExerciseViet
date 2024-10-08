package org.snva;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.print("String : ");
        RevertStringOne revertString = new RevertStringOne();
        revertString.setStr("123456");
        String getrevertstring = revertString.revert();
        System.out.println("reverse :"+getrevertstring);

        System.out.print("Palindrome : ");
        CheckPalindromeTwo checkPalindrome = new CheckPalindromeTwo();
        //checkPalindrome.setStr("1254521");
        System.out.println(checkPalindrome.palindrome("1254521"));

        System.out.println("Factorial : 10");
        FactorialThree factorial = new FactorialThree();
        //factorial.factorialOf(10);
        System.out.println(factorial.factorialOf(10));


        System.out.println("Fiboncci : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,");
        Integer[] test= new Integer[]{0,1,1,2,3,5,8,13,21,34,55,89,144};
        Fibonacci fibonacci= new Fibonacci();
        int ind = fibonacci.FiboSeq(test);
        ind--;
        System.out.println("last index of the first fibonacci sequence:"+ ind );
        //System.out.println("Fiboncci : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,");

        System.out.println("Fiboncci : 250 ");
       // Integer[] test= new Integer[]{0,1,1,2,3,5,8,13,21,34,55,89,144};
        GetFibonacciSeqFour getFibonacciSeq = new GetFibonacciSeqFour(250);
        List<Integer> lf = getFibonacciSeq.getSeq();
        System.out.println("Fibinacci Sequence : " + lf );

        System.out.println("Prime number : 7");
        PrimeNumberFive primeNumber=new PrimeNumberFive();
        System.out.println(primeNumber.Isprime(7));

        System.out.println("50 first Prime number :");
        FirstPrimeNumberSix firstPrimeNumber=new FirstPrimeNumberSix();
        firstPrimeNumber.nfirstPrimeNumber(50);
 //       System.out.println("---------7 Is a prime number : " + primeNumber.Isprime(9));

        System.out.println("\nGreatest Common Number : 12, 20");
        GreatestCommonDivisorSeven greatestCommonDivisor = new GreatestCommonDivisorSeven();
        System.out.println(greatestCommonDivisor.getGreatestCommonDivisor(12,20));

        System.out.println("\nLeast Common Number : 12, 20");
        LeastCommonMultipleEigth leastCommonMultipleEigth = new LeastCommonMultipleEigth();
        System.out.println(leastCommonMultipleEigth.getLeastCommonMultiple(12,20));


        System.out.println("\nAnagrams :");
        AnagramNine anagramNine= new AnagramNine();
        System.out.println(anagramNine.isAnagram("bacc","cabc"));

        System.out.println("Vowel count :");
        VowelsInStringTen vowelsInStringTen =new VowelsInStringTen();
        System.out.println(vowelsInStringTen.countVowels("Nguyen"));


        System.out.print("the sum of digits of an integer :");
        SumDigitNumberThirteen sumDigitNumberThirteen = new SumDigitNumberThirteen();
        System.out.println(sumDigitNumberThirteen.getSumDigitNumber(123));

        System.out.print("factor :");
        FactorNumberFourteen factorNumber = new FactorNumberFourteen();
        List<Integer> lFact= factorNumber.getFactor( 120);
        System.out.println(lFact);

        System.out.print("greatest number :");
        GreatestNumberInArrayFifteen greatestNumberInArrayFifteen = new GreatestNumberInArrayFifteen();
        int[] arr = {9,8,4,75,61,10};
        System.out.println(greatestNumberInArrayFifteen.getGreatestNumber(arr));

        System.out.println("Reverse number :  1794");
        ReverseIntegerEleven reverseIntegerEleven = new ReverseIntegerEleven();
        System.out.println(reverseIntegerEleven.getRevertInteger(1794));

        System.out.print("Palindrome Integer : 1234221 ");
        CheckPalindromeIntegerTwelve checkPalindromeIntegerTwelve = new CheckPalindromeIntegerTwelve();
        //checkPalindrome.setStr("1254521");
        System.out.println(checkPalindromeIntegerTwelve.IsPalindromeInteger(1234221));


    }
}