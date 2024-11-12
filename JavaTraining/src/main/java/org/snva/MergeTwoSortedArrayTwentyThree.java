package org.snva;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class MergeTwoSortedArrayTwentyThree {

    public <T> List<T> mergeTwoSortedArray(T[] t1,T[] t2){
        //T[] t_ret=null;

        List<T> l1 = new ArrayList<T>(Arrays.asList(t1));
        //  The below solution can not be used in Generic Programming, it generates an error
        // why ???
        //List<T> l1 = Arrays.asList(t1);
        List<T> l2 = new ArrayList<T>(Arrays.asList(t2));
        //List<T> l2 = Arrays.asList(t2);
        Set<T> set = new HashSet<>();
        l1.addAll(l2);
            List<T> ls = l1.stream().filter(x-> set.add(x) ).sorted().collect(Collectors.toList());
//        List<T> ls = l1.stream().distinct().sorted().collect(Collectors.toList());

        //(E[]) Array.newInstance(clazz, capacity);
        //T[] t_ret = new T[l1.size()];
        //T[] t_ret = (T[]) Array.newInstance(T, l1.size());
        //l1.toArray(t_ret);
       // Collections.sort(l1);
        return (ls);
    }


}
