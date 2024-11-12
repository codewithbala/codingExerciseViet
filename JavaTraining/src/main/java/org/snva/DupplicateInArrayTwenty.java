package org.snva;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DupplicateInArrayTwenty {


    public String[] DuplicateElements (String[] arrCheck){

        Arrays.sort(arrCheck);
        List<String> elements = new ArrayList<String>();
        for(int i =0;i< arrCheck.length-1;i++){
            if((arrCheck[i].equals(arrCheck[i+1])) &&(!elements.contains(arrCheck[i]))){
                elements.add(arrCheck[i]);
            }

        }
        String[] duplicate = new String[elements.size()];
        elements.toArray(duplicate);
        return duplicate;

    }

    public static <T> Set<T>
    findDuplicateInStream(Stream<T> stream)
    {

        // Set to store the duplicate elements
        Set<T> items = new HashSet<>();

        // Return the set of duplicate elements
        return stream

                // Set.add() returns false
                // if the element was
                // already present in the set.
                // Hence filter such elements
                .filter(n -> !items.add(n))

                // Collect duplicate elements
                // in the set
                .collect(Collectors.toSet());
    }

}
