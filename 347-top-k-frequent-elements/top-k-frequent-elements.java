import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //HashMap number->freqquency
        HashMap<Integer, Integer> map = new HashMap<>();

        //counting frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a) //compare according to frequency
        );

        pq.addAll(map.keySet()); //key set

        int[] ans = new int[k]; //[k]

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll(); //answer
        }

        return ans;
    }
}