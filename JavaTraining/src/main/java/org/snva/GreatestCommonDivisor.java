package org.snva;

import java.util.ArrayList;
import java.util.List;

public class GreatestCommonDivisor {

    List<Integer> listDivisor = new ArrayList<>();
    PrimeNumber primeNumber=new PrimeNumber();
    public int getGreatestCommonDivisor(int a, int b){
        if(a<0 || b<0){return (0);}
        int nb = Math.min(a,b);
        //List<Integer> listDivisor = new ArrayList<Integer>();
        if ( a == 0 || b==0) {return (0);}
        if (a == 1 || b == 1) {return (1);}
        PrimeNumber primeNumber=new PrimeNumber();
        searchDivisor(nb);
        nb = Math.max(a,b);
        int ind= nb;
        while(ind>1){
            if(primeNumber.Isprime(ind)){
                if(listDivisor.contains(ind) && (nb%ind == 0)){
                   // System.out.println(ind);
                    return(ind);
                };
            }
            ind--;
        }

        return(0);


    }

    int i;
    boolean searchDivisorComplete = false;
    private void searchDivisor(int a){

        if( a==0){listDivisor.add(0);}
        else if(a==1){listDivisor.add(1);}
        else if(primeNumber.Isprime(a)) {
            if (!listDivisor.contains(a)) {
                listDivisor.add(a);
         //       System.out.println(a);
                searchDivisorComplete = true;
            }
        }
        else{
            i=2;
            while((i<=a)&&(searchDivisorComplete==false)){
                if(primeNumber.Isprime(i)) {
                    if(a%i == 0){
                        listDivisor.add(i);
         //               System.out.println(i);
                        searchDivisor(a/i);
                    }else{
                        i++;
                    }

                }
            }
        }

    }


}
