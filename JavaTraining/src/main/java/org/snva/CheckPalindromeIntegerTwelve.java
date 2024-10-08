package org.snva;

public class CheckPalindromeIntegerTwelve {



    public boolean IsPalindromeInteger(int nb){
        String str = Integer.toString(nb);
        CheckPalindromeTwo checkPalindromeTwo = new CheckPalindromeTwo();
       // checkPalindromeTwo.setStr(str);
        return (checkPalindromeTwo.palindrome(str));

    }
}
