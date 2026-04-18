class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;  // Important step

            int remainder = columnNumber % 26;
            char ch = (char) ('A' + remainder);

            result.append(ch);

            columnNumber = columnNumber / 26;
        }

        return result.reverse().toString();
    }
}
