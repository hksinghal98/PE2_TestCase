package com.stackroute;

public class q2 {
    public boolean checkPower(int n) {

        boolean flag = false;

        if (n == 0) return false;
        while (n != 1) {
            if (n % 4 != 0) {
                return false;
            }
            n = n / 4;
        }
        return true;
    }
}
