package com.stackroute;

public class q6 {
    public String[] findFactorial(){
        String[] result = new String[21];
        for(int i=1; i<=20;i++){
            long x = Factorial(i);
            String str = "The factorial of " + i + " is " + x;
            result[i-1] = str;
        }
        result[20] = "The factorial of 21 is out of range";
        return result;
    }

    public static long Factorial(int i){
        if(i==0) return 1;
        else return (i*Factorial(i-1));

    }
    }

