package org.snva;

public class FirstPrimeNumber {

    static public void nfirstPrimeNumber(int n){
        int count=1;
        int nb =1;
        PrimeNumber primeNumber=new PrimeNumber();
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
