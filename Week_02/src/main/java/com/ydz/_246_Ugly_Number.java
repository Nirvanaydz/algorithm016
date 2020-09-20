package com.ydz;

//  动态规划
public class _246_Ugly_Number {

    public int nthUglyNumber(int n) {
        int[] res = new int[n];
        res[0] = 1;
        int a = 0, b = 0, c = 0;
        for (int i = 1; i < res.length; i++) {
            int numA = res[a] * 2;
            int numB = res[b] * 3;
            int numC = res[c] * 5;
            res[i] = Math.min(numA, Math.min(numB, numC));
            a = res[i] == numA ? a + 1 : a;
            b = res[i] == numB ? b + 1 : b;
            c = res[i] == numC ? c + 1 : c;
        }
        return res[n-1];
    }
}
