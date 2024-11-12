package org.snva;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//https://www.geeksforgeeks.org/how-to-find-duplicate-elements-in-a-stream-in-java/
public class FrequencyElementArraytwentyTwo {
/*

    public int[] getFrequenccyElement(int[] t){
            int[] t_ret;

        Stream stream = (Stream) Arrays.stream(t);
        stream.sorted().map(x->x,x->Collectors.groupingByConcurrent(count(x))).collect(Collectors.groupingBy(x))
        return (t_ret)
    }
*/



//    public static <T> Set<T>
    public static <T> Map<T, Long>
    findDuplicateInStream(Stream<T> stream)
    {
        //return
          Map<T,Long>   map=   stream

                // Group the elements along
                // with their frequency in a map
                .collect(
                        Collectors.groupingBy(   // Collectors.groupingBy that regroups the values in the stream and return a Map<T,Long>
                                Function.identity(),  // Cette function returns the same value that received
                                Collectors.counting()));  //
          return map;
//
//                // Convert this map into a stream
//                .entrySet()
//                .stream()
//
//                // Check if frequency > 1
//                // for duplicate elements
//                .filter(m -> m.getValue() > 1)
//
//                // Find such elements
//                .map(Map.Entry::getKey)
//
//                // And Collect them in a Set
//                .collect(Collectors.toSet());
    }

//    public static <T> Set<T>
    public static <T> Map<T,Integer>
    findDuplicateInStream2 (List<T> list)
    {
        // Return the set of duplicate elements
       // return

                // Get the stream from the list
               Map<T, Integer> map= list.stream()

                        // Count the frequency of each element
                        // and filter the elements
                        // with frequency > 1
                        //.filter(i -> Collections.frequency(list, i) > 1)
                       // .map(i->i, i-> Collections.frequency(list,i))
                        // And Collect them in a Set
                        //.collect(Collectors.toSet());
                        .collect(Collectors.toMap(i->i, i-> Collections.frequency(list,i)));
               return map;
    }
}
