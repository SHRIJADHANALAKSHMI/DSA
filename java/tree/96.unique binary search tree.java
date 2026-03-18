package tree;
class Solution {
    public int numTrees(int n) {
        
        int[] dp = new int[n + 1];

        // Base cases.
        dp[0] = 1;
        dp[1] = 1;

        // Fill DP array
        for (int i = 2; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                dp[i] += dp[j - 1] * dp[i - j];
            }
        }

        return dp[n];
    }
}