package org.snva;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SecondGreatestNumberInArraySixteen {

    public int getSecondgreatestnumber(int[] arrNumber){
        System.out.print('[');
        IntStream intStream = IntStream.of(arrNumber);
        intStream.forEach(x->System.out.print(x));
        System.out.println(']');
        Arrays.sort(arrNumber);
        return(arrNumber[arrNumber.length-2]);
    }

}
