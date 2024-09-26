package org.snva;

public class RevertString {
    String str ="abcdef";
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

     public String revert() {
        StringBuilder stringBuilder=new StringBuilder(str);
        return(stringBuilder.reverse().toString());


     }



}
