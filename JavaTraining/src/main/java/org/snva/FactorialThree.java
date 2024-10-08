package org.snva;

public class FactorialThree {

    static public int factorialOf(int nbf){
        int fResult=1;
        for (int i=2;i<=nbf;i++) {
            fResult= fResult*i;
        }
        return (fResult);
    }
}
