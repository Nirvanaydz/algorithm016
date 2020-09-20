package com.ydz;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class _347_TopKFrequentEle {
    public int[] topKFrequent(int[] nums, int k) {
        //  count
        Map<Integer,Integer> tmpMap = new HashMap<>();
        for (int num : nums) {
            if (tmpMap.containsKey(num)) {
                tmpMap.put(num, tmpMap.get(num) + 1);
            } else {
                tmpMap.put(num, 1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return tmpMap.get(a) - tmpMap.get(b);
            }
        });

        for (Integer key : tmpMap.keySet()) {
            if (pq.size() < k) {
                pq.add(key);
            } else if (tmpMap.get(key) > tmpMap.get(pq.peek())) {
                pq.remove();
                pq.add(key);
            }
        }

        //  get res
        int[] resIntAr = new int[pq.size()];
        for (int i = 0; i < resIntAr.length; i++) {
            resIntAr[i] = pq.remove();
        }

        return resIntAr;

    }
}
