package Leetcode;

public class FindMostFrequentVowelAndConsonants {
    // Leetcode 3541. Find the Most Frequent Vowel and Consonant in a String
    // Time Complexity: O(n) where n is the length of the string
    // Space Complexity: O(1) since we are using a fixed size array of 26
    public int maxFreqSum(String s) {
        int count[] = new int[26];
        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        int maxVowel =0;
        int maxConsonant =0;
        for(int i = 0; i<26;i++){
            char ch = (char) (i + 'a');
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            maxVowel = Math.max(maxVowel, count[i]);
            }
            else maxConsonant = Math.max(maxConsonant, count[i]);
        }
        return maxVowel + maxConsonant;
    }
}

