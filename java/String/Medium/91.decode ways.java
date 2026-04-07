class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        
        // Edge case
        if (s.charAt(0) == '0') return 0;
        
        int[] dp = new int[n + 1];
        dp[0] = 1;  // empty string
        dp[1] = 1;  // first char valid
        
        for (int i = 2; i <= n; i++) {
            char one = s.charAt(i - 1);
            char two = s.charAt(i - 2);
            
            // 1-digit check
            if (one != '0') {
                dp[i] += dp[i - 1];
            }
            
            // 2-digit check
            int num = (two - '0') * 10 + (one - '0');
            if (num >= 10 && num <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        
        return dp[n];
    }
}