package org.snva;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Stream.*;

public class AnagramNine {


    public boolean isAnagram(String stA, String stB){
        System.out.println("\nAnagrams : " + stA + ","+stB);
            if(stA.length() != stB.length()){return false; }

            char arrA[] = {'b','a','c'};
     //       Arrays.sort(arrA);

            int i = stA.length();
            char arrayA[] =  new char[i];
            for(int j=0;j<i;j++){
                arrayA[j] = stA.charAt(j);
            }
            Arrays.sort(arrayA);

            char[] arrayB = new char[i];
            for(int j=0;j<i;j++){
                arrayB[j] = stB.charAt(j);
            }
            Arrays.sort(arrayB);


/* SOLUTION 1
            for(int j=0;j<i;j++) {
              //  if (Character.valueOf(arrayA[j]) != Character.valueOf(arrayB[j]))  {
                    if (arrayA[j] != arrayB[j])  {
                        return false;
                    }
                //}
            }
*/


// SOLUTION 2
            Object[] ojbA = {arrayA};
            Object[] ojbB = {arrayB};
            return(Arrays.deepEquals(ojbA,ojbB));

// SOLUTION 3
            // why it does work ???
/*
            List<char[]> lcarA = Arrays.asList(arrayA);
            List<char[]> lcarB = Arrays.asList(arrayB);

             Stream stream = Stream.of(lcarA);
            if( stream.allMatch(
                    x->lcarB.contains(x))){
                return true;}
            else{
                return false;}
*/
       // Stream stream = Arrays.stream(arrayA);



        // return(true);
    }


}
