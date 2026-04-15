import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int[] nums, List<Integer> current, List<List<Integer>> result) {
        // Step 1: add current subset
        result.add(new ArrayList<>(current));

        // Step 2: explore choices
        for (int i = start; i < nums.length; i++) {
            // choose element
            current.add(nums[i]);

            // go deeper
            backtrack(i + 1, nums, current, result);

            // backtrack (remove element)
            current.remove(current.size() - 1);
        }
    }
}