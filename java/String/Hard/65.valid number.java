class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        
        boolean numSeen = false;
        boolean dotSeen = false;
        boolean eSeen = false;
        boolean numAfterE = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Case 1: Digit
            if (Character.isDigit(ch)) {
                numSeen = true;
                numAfterE = true;
            }

            // Case 2: Dot
            else if (ch == '.') {
                // Dot not allowed after e or if already used
                if (dotSeen || eSeen)
                    return false;
                dotSeen = true;
            }

            // Case 3: Exponent
            else if (ch == 'e' || ch == 'E') {
                // e must appear once and only after a number
                if (eSeen || !numSeen)
                    return false;
                eSeen = true;
                numAfterE = false;  // must check digits after e
            }

            // Case 4: Sign
            else if (ch == '+' || ch == '-') {
                // Sign allowed only at start or after e
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')
                    return false;
            }

            // Case 5: Invalid character
            else {
                return false;
            }
        }

        return numSeen && numAfterE;
    }
}
