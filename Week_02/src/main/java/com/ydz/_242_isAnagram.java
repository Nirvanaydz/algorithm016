package com.ydz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _242_isAnagram {

    public boolean isAnagram01(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        //  暴力求解
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        //  sort
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        //  diff
        return Arrays.equals(sChar,tChar);

    }

    //  两次遍历求解map，不太好的解法
    public boolean isAnagram02(String s, String t) {
            char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Map<Character,Integer> tmpMap = new HashMap<>();
        for (int i = 0; i < sChar.length; i++) {
            if (tmpMap.containsKey(sChar[i])) {
                int tmpValue = tmpMap.get(sChar[i]);
                tmpValue++;
                tmpMap.put(sChar[i],tmpValue);
            } else {
                tmpMap.put(sChar[i],1);
            }
        }
        for (int i = 0; i < tChar.length; i++) {
            if (tmpMap.containsKey(tChar[i])) {
                int tmpValue = tmpMap.get(tChar[i]);
                tmpValue--;
                if (tmpValue == 0) {
                    tmpMap.remove(tChar[i]);
                } else {
                    tmpMap.put(tChar[i],tmpValue);
                }
            } else {
                break;
            }
        }
        return tmpMap.isEmpty();
    }
    //  hash实现
    public boolean isAnagram03(String s, String t) {
        //  hash表实现，直接记忆使用方法！
        int[] tmpIntAry = new int[26];//    注意26这个数组长度
        for (int i = 0; i < s.length(); i++) {
            tmpIntAry[s.charAt(i) - 'a']++;
            tmpIntAry[t.charAt(i) - 'a']--;
        }
        for (int i : tmpIntAry) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

}
