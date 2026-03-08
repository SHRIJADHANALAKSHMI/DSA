import java.util.*;

class Solution {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(nums, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int[] nums, List<Integer> temp, List<List<Integer>> result){

        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int num : nums){

            if(temp.contains(num)) continue;

            temp.add(num);

            backtrack(nums, temp, result);

            temp.remove(temp.size() - 1);
        }
    }
}

/*
1. Create result list
2. Create temporary list
3. If temp size == nums length → store result
4. Loop through numbers
5. Skip if already used
6. Add number
7. Recurse
8. Remove number (backtrack) */