package com.ydz.easy;

import org.junit.Test;

//Given an array nums, write a function to move all 0's to the end of it while m
//aintaining the relative order of the non-zero elements.
//
// Example:
//
//
//Input: [0,1,0,3,12]
//Output: [1,3,12,0,0]
//
// Note:
//
//
// You must do this in-place without making a copy of the array.
// Minimize the total number of operations.
// Related Topics 数组 双指针
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        //  建立两个动态指针
        //  都是从数组的起始位置开始
        //  只交换，再次循环后将j之后的元素都变为0
        /*int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }*/
        //  交换数值并指针后移
        int mid = 0;
        for (int i = 0,j = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                mid = nums[j];
                nums[j] = nums[i];
                nums[i] = mid;
                j++;
            }
        }

    }
}

