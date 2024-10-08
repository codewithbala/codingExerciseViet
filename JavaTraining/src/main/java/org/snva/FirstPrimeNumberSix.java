package org.snva;

public class FirstPrimeNumberSix {

    static public void nfirstPrimeNumber(int n){
        int count=1;
        int nb =1;
        PrimeNumberFive primeNumber=new PrimeNumberFive();
        while (count<=n) {
            if(primeNumber.Isprime(nb)) {
                System.out.print(nb+";");
                count++;
            }
            nb++;
        }


        //return()

    }

}
