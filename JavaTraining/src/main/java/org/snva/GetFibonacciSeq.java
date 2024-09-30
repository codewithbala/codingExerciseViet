package org.snva;

import java.util.ArrayList;
import java.util.List;

public class GetFibonacciSeq {
    int fiboSeq ;
    public GetFibonacciSeq(int nb) {
        fiboSeq = nb;
    }

    public List<Integer> getSeq(){
        List<Integer> Fibolist = new ArrayList<Integer>();
        Fibolist.add(0);
        Fibolist.add(1);
        while((Fibolist.get(Fibolist.size()-1)+Fibolist.get(Fibolist.size()-2))<= fiboSeq){
            Fibolist.add(Fibolist.get(Fibolist.size()-1)+Fibolist.get(Fibolist.size()-2));

        }
        return (Fibolist);

    }

}
