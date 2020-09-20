package com.ydz;

import org.junit.Test;

import java.util.*;

public class _49_Group_Anagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        //  创建一个map集合，存放异位词
        //  调用比较两个string对象是否为异位词，不是的话就添加新的key，是的话就加入到集合中
        //  最后将每一个value加入到集合中返回

        //  create resList
//        List<List<String>> resList = new ArrayList<>();
        //  create tmpMap to compare two string
        Map<String,List<String>> tmpMap = new HashMap<>();
        List<String> tmpList;
        for (String str : strs) {
            char[] tmpStrChar = str.toCharArray();
            Arrays.sort(tmpStrChar);
            String tmpStr = new String(tmpStrChar);
            if (tmpMap.containsKey(tmpStr)){
                tmpList = tmpMap.get(tmpStr);
            } else {
                tmpList = new ArrayList<String>();
            }
            tmpList.add(str);
            tmpMap.put(tmpStr, tmpList);
        }
        //  add map's value to resList
//        for (List<String> value : tmpMap.values()) {
//            resList.add(value);
//        }
        return new ArrayList<>(tmpMap.values());//  多掌握创建对象的方法，与注释的地方比较
    }
}
