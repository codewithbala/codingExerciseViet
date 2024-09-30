package org.snva;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {

    List<Integer> FibonacciChecklist;

    public int FiboSeq (Integer[] lFibo) {
        FibonacciChecklist = new ArrayList<>(Arrays.asList(lFibo));
        int i=0;
        while(i <= FibonacciChecklist.size() - 3){
        //for (int i = 0; i <= FibonacciChecklist.size() - 3; i++) {
            if ((FibonacciChecklist.get(i) + FibonacciChecklist.get(i + 1)) != FibonacciChecklist.get(i + 2)) {
                return (i + 2);
            }
            i++;
        }
        if (i != 0) { return (i+2) ;}
            else{
        return (0);}
    }
}
