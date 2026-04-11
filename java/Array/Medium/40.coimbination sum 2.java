import java.util.*;

class Solution {
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); //  important
        
        backtrack(0, candidates, target, new ArrayList<>(), result);
        
        return result;
    }
    
    private void backtrack(int start, int[] candidates, int target, 
                           List<Integer> temp, List<List<Integer>> result) {
        
        //  base case
        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
            
            // skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            
            //  stop early (since sorted)
            if (candidates[i] > target) break;
            
            temp.add(candidates[i]);
            
            //  move to next index (no reuse)
            backtrack(i + 1, candidates, target - candidates[i], temp, result);
            
            temp.remove(temp.size() - 1); // backtrack
        }
    }
}