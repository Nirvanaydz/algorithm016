package com.ydz.easy;

public class TwoSum {
    /**
     * 未学习hash表，先使用暴力循环求解的方式
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums,int target) {
        // return res
        int[] res = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target-nums[j] == nums[i]){
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return new int[0];
    }
}
