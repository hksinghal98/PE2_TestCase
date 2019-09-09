package com.stackroute;

import java.util.*;

public class q5 {
    public double findAverage(int number,int[] marks){
        if(marks.length < number) return 0;
        int sum =0;
        double avg = 0.0F;
        for (int i =0; i<number;i++){
            sum += marks[i];
        }
        avg = sum/(double)number;
        return avg;
    }

    public int findMinimum(int n, int[] marks){
        if(marks.length<n) return 0;
        Arrays.sort(marks);
        return marks[0];
    }
    public static int findMaximum(int n, int[] marks){
        if(marks.length<n) return 0;
        Arrays.sort(marks);
        return marks[n-1];
    }

}
