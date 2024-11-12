package org.snva;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.print("String : ");
        RevertStringOne revertString = new RevertStringOne();
        revertString.setStr("123456");
        String getrevertstring = revertString.revert();
        System.out.println("reverse :"+getrevertstring);


        System.out.println("Palindrome : ");
        CheckPalindromeTwo checkPalindrome = new CheckPalindromeTwo();
        //checkPalindrome.setStr("1254521");
        System.out.println("check ="+checkPalindrome.palindrome("1254521"));
        System.out.println("check2 ="+checkPalindrome.palindromewithStringbuilder("1254521"));

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

        System.out.println("Reverse number :  1794");
        ReverseIntegerEleven reverseIntegerEleven = new ReverseIntegerEleven();
        System.out.println(reverseIntegerEleven.getRevertInteger(1794));

        System.out.print("Palindrome Integer : 1234221 ");
        CheckPalindromeIntegerTwelve checkPalindromeIntegerTwelve = new CheckPalindromeIntegerTwelve();
        //checkPalindrome.setStr("1254521");
        System.out.println(checkPalindromeIntegerTwelve.IsPalindromeInteger(1234221));

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

        System.out.print("Second greatest number :");
        SecondGreatestNumberInArraySixteen secondGreatestNumberInArraySixteen = new SecondGreatestNumberInArraySixteen();
        int[] MyArr = {9,8,4,75,61,10};
        System.out.println(secondGreatestNumberInArraySixteen.getSecondgreatestnumber(MyArr));

        System.out.println("1,2,3,4,6,7,10");
        MissingNumberInRangeSeventeen missingNumberInRangeSeventeen=new MissingNumberInRangeSeventeen();
        int[] arrCheck = {1,2,3,4,6,7,10};
        List<Integer> misiingList = missingNumberInRangeSeventeen.findMissingInRange(10,arrCheck);
        System.out.println(misiingList);

        System.out.println("1,2,3,4,6,7,10");
        int[] arrSorted = {1,2,3,8,6,7,10};
        ArraySortedEigtheen arraySortedEigtheen=new ArraySortedEigtheen();
        System.out.println(arraySortedEigtheen.isArraySorted(arrSorted));

        System.out.println("1Jack 2steven 3Bill 4Smith 5Bala");
        String[] names = new String[]{"1Jack", "2steven", "3Bill", "4Smith", "5Bala"};
        RotateArrayNineteen rotateArrayNineteen= new RotateArrayNineteen();
        names = rotateArrayNineteen.arrayRotated(2,names);
        for (String str :names) {
            System.out.print(str+" ");
        }

        System.out.println();
        System.out.println("Find duplicate elements : 1Jack 2steven 3Bill 3Bill 4Smith 5Bala");
        String[] arrNames = new String[]{"1Jack", "2steven", "3Bill","3Bill", "4Smith", "5Bala"};
        DupplicateInArrayTwenty dupplicateInArrayTwenty= new DupplicateInArrayTwenty();
        String[] duplicatedNames =  dupplicateInArrayTwenty.DuplicateElements(arrNames);
        for (String str :duplicatedNames) {
            System.out.print(str+" ");
        }

        System.out.println();
        System.out.println("Remove duplicate elements :   1Jack 2steven 3Bill 3Bill 4Smith 5Bala");
        String[] duplicateList = new String[]{"1Jack", "2steven", "3Bill","3Bill", "4Smith", "5Bala"};
        RemoveDuplicateTwentyOne removeDuplicateTwentyOne=new RemoveDuplicateTwentyOne();
        String[] newList = removeDuplicateTwentyOne.RemoveDuplicateElements(duplicateList);
        for (String str :newList) {
            System.out.print(str+" ");
        }


        System.out.println("\n ==================================\n");
        Stream<Integer> stream
                = Stream.of(5, 13, 4,
                21, 13, 27,
                2, 59, 59, 34);
        FrequencyElementArraytwentyTwo frequencyElementArraytwentyTwo= new FrequencyElementArraytwentyTwo();
        // Print the found duplicate elements
        System.out.println(
                frequencyElementArraytwentyTwo.findDuplicateInStream(stream));

////////////////////////////////////////////////////
        System.out.println("\n frequency 2==================================\n");
// Initial stream
        List<Integer> listDup
                = Arrays.asList(5, 13, 4,
                21, 13, 27,
                2, 59, 59, 34);

        // Print the found duplicate elements
       // System.out.println(
       //         frequencyElementArraytwentyTwo.findDuplicateInStream2(listDup));

        System.out.println(" MergeTwoSortedArrayTwentyThree  ");
        Integer[] t_1 = {1,2,3,8,8,10};
        Integer[] t_2 = {8,6,7,10};

        MergeTwoSortedArrayTwentyThree mergeTwoSortedArrayTwentyThree = new MergeTwoSortedArrayTwentyThree();
        List<Integer>  lsM=mergeTwoSortedArrayTwentyThree.mergeTwoSortedArray(t_1,t_2);
        System.out.println(lsM);

        System.out.println(" Find Intersection between 2 arrays  ");
        IntersectionOfTwoArrayTwentyFourth intersectionOfTwoArrayTwentyFourth =new IntersectionOfTwoArrayTwentyFourth();
        List<Integer> intersection = intersectionOfTwoArrayTwentyFourth.intersection2Array(t_1,t_2);
        System.out.println("intersection = "+intersection);

        System.out.println("----Capitalize first characters for each words in the sentence-------------  ");
        CapitalizeFirstLetterEachWordTwentyseven capitalizeFirstLetterEachWordTwentyseven = new CapitalizeFirstLetterEachWordTwentyseven();
        String st= "I am very very stressfull";
        System.out.println(capitalizeFirstLetterEachWordTwentyseven.capitalizeFirstLetter(st));

        System.out.println("----Check if valid email-------------  ");
        String email ="viet5@gmail.com";
        String regex= "[a-zA-Z0-9.-]+(.[a-zA-Z]{2,})+";
        Pattern pE = Pattern.compile(regex);
        Matcher mE = pE.matcher(email);
        System.out.println("Email true or false = "+mE.matches());

        System.out.println("----Find longest Palindrome-------------  ");
        LongestPalindromeThirty longestPalindromeThirty=new LongestPalindromeThirty();
        System.out.println(longestPalindromeThirty.longestPalindrome("ttyyuabcdoedcbajjhg"));


        System.out.println(" different betwen flatMap() and map()  ");
        List<String> list = Arrays.asList("Geeks", "GFG", "GeeksforGeeks", "gfg");
        // Using Stream flatMap(Function mapper)
        list.stream()
                //in this case, the character is interpreted like a stream with 1 character
                //the lamda function in flatMap has to return a stream, a list. or an array.
                //.flatMap(str -> Stream.of(str.charAt(2)))
                .map(str -> str.charAt(2))// in this cas, each character is an element in the stream.The lamda function return just an element
                .forEach(System.out::println);


    }
}