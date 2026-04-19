class Solution {
    public int lengthLongestPath(String input) {
        
        String[] lines = input.split("\n");
        int[] pathLen = new int[lines.length + 1];
        int maxLen = 0;
        
        for (String line : lines) {
            
            int level = line.lastIndexOf("\t") + 1;
            String name = line.substring(level);
            
            if (name.contains(".")) {
                // file
                int currLen = pathLen[level] + name.length();
                maxLen = Math.max(maxLen, currLen);
            } else {
                
                pathLen[level + 1] = pathLen[level] + name.length() + 1;
           
            }
        }
        
        return maxLen;
    }
}