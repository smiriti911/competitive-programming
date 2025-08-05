class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0; // count of unmatched '('
        int unmatchedClose = 0; // count of unmatched ')'

        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else if (c == ')') {
                if (open > 0) {
                    open--; // matched with a '('
                } else {
                    unmatchedClose++; // no '(' to match with
                }
            }
        }

        // total insertions = unmatched '(' + unmatched ')'
        return open + unmatchedClose;
    }
}
