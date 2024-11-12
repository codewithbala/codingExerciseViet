package org.snva;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateTwentyOne {

    public String[] RemoveDuplicateElements (String[] arrCheck) {
        List<String> listCoverted = Arrays.asList( arrCheck );
        List<String> returnList = new ArrayList<>();
        for (String str:listCoverted) {
            if(!returnList.contains(str)){
                returnList.add(str);
            }
        }

        String[] returnArray = new String[returnList.size()];
        returnList.toArray(returnArray);
        return(returnArray);
    }

}
