package com.ydz;

import java.util.HashMap;
import java.util.Map;

public class _1_Two_Sum {
    public int[] twoSum01(int[] nums, int target) {
        if (nums.length < 2) {
            throw new NullPointerException("no result!");
        }
        int[] res = new int[2];
        Map<Integer,Integer> tmpMap = new HashMap<>();
        //  两边遍历，第一次存放，第二次判断，且不考虑自己，如结果为4，而只有一个2的时候
        for (int i = 0; i < nums.length; i++) {
            tmpMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int tmpInt = target - nums[i];
            if (tmpMap.containsKey(tmpInt) && tmpMap.get(tmpInt) != i) {//  第二次判断，且不考虑自己
                res[0] = tmpMap.get(tmpInt);
                res[1] = i;
            }
        }
        return res;
    }

    public int[] twoSum02(int[] nums, int target) {
        if (nums.length < 2) {
            return new int[2];
        }
        int[] res = new int[2];
        //
        Map<Integer,Integer> tmpMap = new HashMap<>();
        //  一遍遍历，边存边放，因为题意给出有且只有一个唯一解
        for (int i = 0; i < nums.length; i++) {
            int tmpInt = target - nums[i];
//            if (tmpMap.containsKey(tmpInt) && tmpMap.get(tmpInt) != i) {
            if (tmpMap.containsKey(tmpInt)) {//  去除掉排除本身的条件，因为一边遍历，一边添加的
                return new int[]{tmpMap.get(tmpInt), i};
            }
            tmpMap.put(nums[i], i);
        }
        return res;
    }
}
