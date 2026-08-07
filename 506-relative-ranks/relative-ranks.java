import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        Integer[] indices = new Integer[n];

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> Integer.compare(score[b], score[a]));

        String[] answer = new String[n];

        for (int rank = 0; rank < n; rank++) {
            int originalIndex = indices[rank];

            if (rank == 0) {
                answer[originalIndex] = "Gold Medal";
            } else if (rank == 1) {
                answer[originalIndex] = "Silver Medal";
            } else if (rank == 2) {
                answer[originalIndex] = "Bronze Medal";
            } else {
                answer[originalIndex] = String.valueOf(rank + 1);
            }
        }

        return answer;
    }
}