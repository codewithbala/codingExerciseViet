package org.snva;

import java.util.ArrayList;
import java.util.List;

public class GreatestCommonDivisorSeven {

    List<Integer> listDivisorA = new ArrayList<>();
    List<Integer> listDivisorB = new ArrayList<>();
    PrimeNumberFive primeNumber=new PrimeNumberFive();
    boolean searchDivisorComplete = false;

    public int getGreatestCommonDivisor(int a, int b){
        if(a<0 || b<0){return (0);}
        int nb = Math.min(a,b);
        //List<Integer> listDivisor = new ArrayList<Integer>();
        if ( a == 0 || b==0) {return (0);}
        if (a == 1 || b == 1) {return (1);}
        PrimeNumberFive primeNumber=new PrimeNumberFive();
        searchDivisor(nb,listDivisorA);
        nb = Math.max(a,b);
        searchDivisorComplete = false;
        searchDivisor(nb,listDivisorB);
        int ind= listDivisorA.size();
        int divisor =1;
        for(int i : listDivisorA){
        //listDivisorA.forEach(x->{
        if(listDivisorB.contains(i)){
                divisor=divisor*i;
                listDivisorB.remove(listDivisorB.indexOf(i));


            }
        }
        return(divisor);

/*
        while(ind>1){
            if(primeNumber.Isprime(ind)){
                if(listDivisor.contains(ind) && (nb%ind == 0)){
                   // System.out.println(ind);
                    divisor=divisor*ind;
                    int j=listDivisor.indexOf(ind);
                    listDivisor.remove(j);


                    ind= nb%ind;
                    //return(ind);
                };

            }
            ind--;
        }
*/

     //   return(0);


    }

    int i;

    public void getDivisor(int a,  List<Integer> listDivisor){
        searchDivisorComplete = false;
        searchDivisor(a, listDivisor);;
    }
    public void searchDivisor(int a,  List<Integer> listDivisor){
       // List<Integer> listDivisor = new ArrayList<>();
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
                        searchDivisor(a/i, listDivisor);
                    }else{
                        i++;
                    }

                }
            }
        }

    }


}
