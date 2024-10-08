package org.snva;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GreatestNumberInArrayFifteen {



    public int getGreatestNumber (int[] arrNumber){
        System.out.print('[');
        IntStream intStream = IntStream.of(arrNumber);
        intStream.forEach(x->System.out.print(x));
        System.out.println(']');
        Arrays.sort(arrNumber);
        return(arrNumber[arrNumber.length-1]);



    }

}
