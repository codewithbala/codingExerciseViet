package org.snva;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LeastCommonMultipleEigth {

    Set<Integer> setDivisorA ; // = new HashSet<>();
    Set<Integer> setDivisorB ; //= new HashSet<>();
    List<Integer> listDivisorA = new ArrayList<>();
    List<Integer> listDivisorB = new ArrayList<>();
    int nb;
    int lcm=1;
    public int getLeastCommonMultiple(int a,int b){
        GreatestCommonDivisorSeven greatestCommonDivisor=new GreatestCommonDivisorSeven();
        nb = Math.max(a,b);
        greatestCommonDivisor.getDivisor(nb,listDivisorA);
//        setDivisorA = new HashSet<Integer>(listDivisorA);
        nb = Math.min(a,b);
        greatestCommonDivisor.getDivisor(nb,listDivisorB);
//        setDivisorB = new HashSet<Integer>(listDivisorB);

        for(int i : listDivisorA){
            lcm=lcm*i;
            if(listDivisorB.contains(i)){
                listDivisorB.remove(listDivisorB.indexOf(i));
            }
        }
        if(listDivisorB.size()>0) {
            for (int i : listDivisorB) {
                    lcm = lcm * i;
            }
        }

        return (lcm);

    }

}
