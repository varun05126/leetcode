class Solution {
public:
    int lastStoneWeight(vector<int>& stones) {
        while (true) {
            sort(stones.begin(), stones.end());

            int count = 0;

            for (int stone : stones) {
                if (stone != 0) {
                    count++;
                }
            }

            if (count == 0) {
                return 0;
            }

            if (count == 1) {
                return stones.back();
            }

            int n = stones.size();

            // The two largest stones are stones[n - 1] and stones[n - 2]
            stones[n - 1] = stones[n - 1] - stones[n - 2];
            stones[n - 2] = 0;
        }
    }
};