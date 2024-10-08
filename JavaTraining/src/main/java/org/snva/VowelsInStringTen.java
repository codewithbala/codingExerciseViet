package org.snva;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class VowelsInStringTen {
    char[] arr = {'a','e','i','o','u','A','E','I','O','U'};
    //  ArrayList<Character> lchar = new ArrayList<Character>((Character)Arrays.asList(arr));

    //Object[] obj = Arrays.

    public int countVowels (String str){
        System.out.println(str);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(IsVowels(str.charAt(i))){
                count++;
            };

        }
        return (count);

    }

    private boolean IsVowels(char a){
        for(int i = 0; i < arr.length; i++){
            if(a == arr[i]){
                return true;
            }
        }
        return false;
    }


}
