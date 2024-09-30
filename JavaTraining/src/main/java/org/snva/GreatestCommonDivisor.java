package org.snva;

import java.util.ArrayList;
import java.util.List;

public class GreatestCommonDivisor {

    List<Integer> listDivisor = new ArrayList<>();
    PrimeNumber primeNumber=new PrimeNumber();
    public int getGreatestCommonDivisor(int a, int b){
        int nb = Math.min(a,b);
        List<Integer> listCommonDivisor = new ArrayList<Integer>();
        if ( a == 0 || b==0) {return (0);}
        if (a == 1 || b == 1) {return (1);}
        PrimeNumber primeNumber=new PrimeNumber();

        while(nb >1){
            if(primeNumber.Isprime(nb)){
                listCommonDivisor.add(nb);
            }
            nb--;
        }
        nb = Math.max(a,b);
        while(nb>1){
            if(primeNumber.Isprime(nb)){
                if(listCommonDivisor.contains(nb)){
                    return(nb);
                };
            }
            nb--;
        }

        return(0);


    }


    private void searchDivisor(int a){
        int i =1;
        if( a==0){listDivisor.add(0);}
        else if(a==1){listDivisor.add(1);}
        else{
        while(i<=a){
            if(primeNumber.Isprime(i))   {
                    if(a%i == 0){
                        listDivisor.add(i);
                        listDivisor.add(a/i);
                    }

                }
            }
        }

    }


}
