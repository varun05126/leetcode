import java.util.Arrays;

class Solution {
    public int lastStoneWeight(int[] stones) {

        while (true) {

            Arrays.sort(stones);

            int count = 0;
            for (int stone : stones) {
                if (stone != 0)
                    count++;
            }

            if (count == 0)
                return 0;

            if (count == 1)
                return stones[stones.length - 1];

            int n = stones.length;

            stones[n - 1] = stones[n - 1] - stones[n - 2];
            stones[n - 2] = 0;
        }
    }
}