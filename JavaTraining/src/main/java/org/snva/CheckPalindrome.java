package org.snva;

public class CheckPalindrome {

    String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public boolean palindrome(){
        char[] cars = new char[str.length()];
        //int haftLength = str.length() /2
        for(int i=0;i < str.length();i++){
            cars[i] = str.charAt(i);
        }
        int j=str.length()-1;
        for(int i=0;i < str.length()/2 ;i++){
            if (cars[i] != cars[j]) { return(false);} else {j--;}
        }
        return (true);
    }

}
