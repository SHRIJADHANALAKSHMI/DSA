import java.util.HashMap;
//importing bnm,,  
class Solution {
    public int[] twoSum(int[] nums, int target) {

        // HashMap to store numbers we've already seen
        // key   -> number from array
        // value -> index of that number
        HashMap<Integer, Integer> map = new HashMap<>();

        // Loop through the array once
        for (int i = 0; i < nums.length; i++) {

            // Find the number needed to reach the target
            // Example: target = 9, current number = 2
            // needed = 9 - 2 = 7
            int needed = target - nums[i];

            // Check if the needed number was already seen before
            if (map.containsKey(needed)) {

                // If yes, return the index of the needed number
                // and the current index
                return new int[] { map.get(needed), i };
            }

            // If not found, store the current number with its index
            // so future numbers can use it
            map.put(nums[i], i);
        }

        // This line will never be reached because the problem
        // guarantees exactly one valid solution
        return new int[] {};
    }
}