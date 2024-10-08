package org.snva;

public class ReverseIntegerEleven {

    public int getRevertInteger(int nb){
        String str = Integer.toString(nb);
        StringBuilder stringBuilder= new StringBuilder(str);
        str = stringBuilder.reverse().toString();
        int returnNb = Integer.parseInt(str);
        return(returnNb);
    }

}
