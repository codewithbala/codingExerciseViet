package org.snva;

public class RevertStringOne {
    String str ="abcdef";
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        System.out.println(str);
        this.str = str;

    }

     public String revert() {
        StringBuilder stringBuilder=new StringBuilder(str);
        return(stringBuilder.reverse().toString());


     }



}
