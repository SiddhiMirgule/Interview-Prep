//https://neetcode.io/problems/top-k-elements-in-list/question?list=neetcode250
package com.siddhi;
import java.util.*;
public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: count frequency
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // Step 2: max-heap based on frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a, b) -> count.get(b) - count.get(a)
        );

        for (int key : count.keySet()) {
            pq.add(key);
        }

        // Step 3: extract top k elements
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll();
        }

        return res;
    }
}
