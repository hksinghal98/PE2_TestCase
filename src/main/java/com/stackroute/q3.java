package com.stackroute;

public class q3 {
    public boolean checkEven(int input) {
        boolean flag = isEven(input);
        return flag;
    }

    public static boolean isEven(int n){
        if(n%2 == 0) return true;
        else return false;
    }
}
