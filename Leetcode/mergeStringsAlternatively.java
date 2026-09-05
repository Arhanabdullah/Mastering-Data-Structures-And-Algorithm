public class mergeStringsAlternatively {
// Leetcode 1768. Merge Strings Alternately
// Time Complexity: O(n) space Complexity: O(n) space
// Merge two strings alternatively and return the merged string.
// If one string is longer than the other, append the remaining characters of the longer string to the merged string.
// use StringBuilder to build the merged string and two pointers to traverse both strings.
        public String mergeAlternately(String word1, String word2) {
            StringBuilder str = new StringBuilder();
            int ptr1 = 0;
            int ptr2 = 0;
            while (ptr1 < word1.length() && ptr2 < word2.length()) {
                str.append(word1.charAt(ptr1));
                ptr1++;
                str.append(word2.charAt(ptr2));
                ptr2++;
            }
            while (ptr1 < word1.length()) {
                str.append(word1.charAt(ptr1));
                ptr1++;
            }
            while (ptr2 < word2.length()) {
                str.append(word2.charAt(ptr2));
                ptr2++;
            }
            return str.toString();
        }
    }

