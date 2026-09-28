package Leetcode;

public class MaxNestingDepth {
    // Leetcode 1614: Maximum Nesting Depth of the Parentheses
    // Time Complexity: O(n), where n is the length of the string s.
    // Space Complexity: O(1)
    // Brute Force solution
        public int maxDepth(String s) {
            int depth = 0;
            int maxDepth = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    depth++;
                }
                if (depth > maxDepth)
                    maxDepth = depth;
                if (s.charAt(i) == ')') {
                    depth--;
                }
            }
            return maxDepth;
        }
    }

