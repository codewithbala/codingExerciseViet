package org.snva;

public class LongestPalindromeThirty {


    public String longestPalindrome(String myString){
        int lg = myString.length();
        String Palindrome = null;
        int lgPalindrome=0;
        for(int i =0;i<lg;i++){
            for(int j=i+1;j<lg;j++){
                String checkString = myString.substring(i,j);
                StringBuilder stringBuilder =new StringBuilder(checkString);
                String reverseString = stringBuilder.reverse().toString();
                if((checkString.equals(reverseString)) &&(checkString.length()>lgPalindrome)) {
                    lgPalindrome = checkString.length();
                    Palindrome = checkString;
                }
            }
        }
        return(Palindrome);
    }

}
