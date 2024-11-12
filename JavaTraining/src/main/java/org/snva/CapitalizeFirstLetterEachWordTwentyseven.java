package org.snva;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeFirstLetterEachWordTwentyseven {
    public String capitalizeFirstLetter(String sentence){
        String[] words = sentence.split(" ");
    String ret=Arrays.stream(words).map(x->Character.toUpperCase(x.charAt(0))+x.substring(1)).map(x->x.toString()).collect(Collectors.joining(" "));
    return(ret);

    }

}
