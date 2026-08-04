class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int min = nums[0];
        int max = nums[0];
        for (int x : nums) {
            if (x < min) min = x;
            if (x > max) max = x;
        }

        boolean[] present = new boolean[max - min + 1];
        for (int x : nums) {
            present[x - min] = true;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (!present[i - min]) {
                result.add(i);
            }
        }

        return result;
    }
}