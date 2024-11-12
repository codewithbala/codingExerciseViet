package org.snva;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MissingNumberInRangeSeventeen {

    public List<Integer> findMissingInRange(int n, int r[]){

/*        //List<Integer> list= new ArrayList<Integer>((Collection<? extends Integer>) Arrays.asList(r)) ;

        List<Integer> list= Arrays.stream(r).boxed().collect(Collectors.toList());
        Stream stream = IntStream.range(1,n).boxed();
        Object missing = stream.filter(x->!(list.contains(x))).collect(Collectors.toList());*/
        List<Integer> list= Arrays.stream(r).boxed().collect(Collectors.toList());
        List<Integer> missing = new ArrayList<>();
        for(int i = 0 ; i<n;i++){
            if(!(list.contains(Integer.valueOf(i+1)))){
                missing.add(i+1);

            }
        }
        return (missing);

    }


}
