package org.snva;

public class SumDigitNumberThirteen {
    int sum=0 ;
    public int getSumDigitNumber(int a) {
        System.out.println(a);
        sum = 0;
        SumDigitNumber(a);
        return sum;
    }
    private void SumDigitNumber(int a){
        if(a != 0){
                int mod = a%10;
                int divisor = a/10;
                sum=sum+mod;
      //          if(divisor!=0) {
                    SumDigitNumber(divisor);
        //        }
         //       else{}
           }
        }




}
