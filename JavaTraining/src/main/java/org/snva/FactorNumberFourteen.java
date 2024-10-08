package org.snva;

import java.util.ArrayList;
import java.util.List;

public class FactorNumberFourteen {


    public List<Integer> getFactor( int a){
        System.out.println(a);
        List<Integer> factor = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        GreatestCommonDivisorSeven greatestCommonDivisor = new GreatestCommonDivisorSeven();
        greatestCommonDivisor.searchDivisor(a,factor);
        for(int i =0;i<factor.size()-1;i++){
            for(int j =i+1;j<factor.size();j++){
                int factorNum =factor.get(i)*factor.get(j);
                if(!result.contains(factorNum)){
                    result.add(factorNum);

                }
            }

        }

        for(int i =0;i<factor.size();i++){
            if(!result.contains(factor.get(i))){
                result.add(factor.get(i));
            }
        }
        return (result);


    }




}
