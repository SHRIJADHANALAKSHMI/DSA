class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        
        // If n is odd
        if (n % 2 != 0) {
            for (int i = 0; i < n; i++) {
                sb.append('a');
            }
        } 
        // If n is even
        else {
            for (int i = 0; i < n - 1; i++) {
                sb.append('a');
            }
            sb.append('b');
        }
        
        return sb.toString();
    }
}