package com.ydz.easy;

public class Rotate {
    // 暴力求解
    /*public void rotate(int[] nums, int k) {
        // 将数组反转一次的函数
        for (int i = 0; i < k; i++) {
            nums = reverseOnce(nums);
        }
    }
    private int[] reverseOnce(int[] nums) {
        int key;
        for (int i = nums.length - 1 ; i >= 1 ; i--) {
            key = nums[i];
            nums[i] = nums[i-1];
            nums[i-1] = key;
        }
        return nums;
    }*/

    //  使用额外数组复制后再求解
    /*public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] extra = new int[len];
        for (int i = 0; i < len; i++) {
            extra[(i+k) % len] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            nums[i] = extra[i];
        }
    }*/

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        //  注意找到翻转的位置。
        k = k % len;
        nums = reverseArray(nums,0,len-1);
        nums = reverseArray(nums,0,k-1);
        nums = reverseArray(nums,k,len-1);
    }
    //  反转一个数组的部分，双指针
    private int[] reverseArray(int[] nums,int start,int end){
        int tmp;
        while (start < end) {
            tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
        return nums;
    }
}
