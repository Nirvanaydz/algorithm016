package com.ydz.easy;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len-1; i >= 0; i--) {
            // 本位加1
            digits[i]++;
            // 本位加1后变成10的倍数，使本位变为0，那么继续执行下一位加1的逻辑，直至最后都加1完成
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        // 补进位，若是最后一位加完后变为0，那么需要补进一位。
        digits = new int[len+1];
        digits[0] = 1;
        return digits;
    }
}
