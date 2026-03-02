/*1346. Check If N and Its Double Exist
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given an array arr of integers, check if there exist two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
 

Example 1:

Input: arr = [10,2,5,3]
Output: true
Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
Example 2:

Input: arr = [3,1,7,11]
Output: false
Explanation: There is no i and j that satisfy the conditions.
*/

import java.util.HashSet;

class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : arr) {
            
            // Check double
            if(set.contains(2 * num)) {
                return true;
            }
            
            // Check half (only if even)
            if(num % 2 == 0 && set.contains(num / 2)) {
                return true;
            }
            
            set.add(num);
        }
        
        return false;
    }
} 


//=======================================================

//brute force approach
//class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i != j && arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }
        
        return false;
    }
}