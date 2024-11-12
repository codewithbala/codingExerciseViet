package org.snva;

import java.util.*;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrayTwentyFourth {

    //   that means we have to find the duplicate elements ??
    public <T> List<T> intersection2Array(T[] arr1, T[] arr2){

        List<T> l1 = new ArrayList<>(Arrays.asList(arr1));
        List<T> l2 = new ArrayList<>(Arrays.asList(arr2));
        //l1.addAll(l2);
        Set<T> set = new HashSet<>();
//        List<T> ls = l1.stream().filter(x->l2.contains(x)).distinct().collect(Collectors.toList());
        List<T> ls = Arrays.stream(arr1).filter(x->l2.contains(x)).distinct().collect(Collectors.toList());

        return(ls);
    }



}
