package binarysearch.hard;

import java.util.*;

public class OnlineMajorityElementInSubarray1157 {
    int[] arr;
    Map<Integer, List<Integer>> map;

    public OnlineMajorityElementInSubarray1157(int[] arr) {

        this.arr = arr;
        for (int i = 0; i < arr.length; i++) {
            List<Integer> list = map.getOrDefault(arr[i], new ArrayList<>());
            list.add(i);
            map.put(arr[i], list);
        }
    }

    public int query(int left, int right, int threshold) {
        for (int i = 0; i < 20; i++) {
            int min = left, max = right;
            int candidate = arr[min + (int) (Math.random() * (max - min + 1))];
            List<Integer> temp = map.get(candidate);
            if (temp.size() < threshold) continue;
            int low = Collections.binarySearch(temp, left);
            int high = Collections.binarySearch(temp, right);
            if (low < 0) low = -low - 1;
            if (high < 0) high = (-high - 1) - 1;
            if (high - low + 1 >= threshold) return candidate;

        }
        return -1;
    }
}

