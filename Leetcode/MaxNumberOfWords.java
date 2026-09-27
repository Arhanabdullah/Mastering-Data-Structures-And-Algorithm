package Leetcode;

public class MaxNumberOfWords {
    // Leetcode 2114: Maximum Number of Words Found in Sentences
    // Time Complexity: O(n*m), where n is the number of sentences and m is the average number of words in each sentence.
    // Space Complexity: O(m), where m is the average number of words in each sentence.
    // Brute Force solution
    
    public int mostWordsFound(String[] sentences) {
        int max =0;
        for(String sentence : sentences){
            String[] words = sentence.trim().split("\\s+");
            if(words.length>max) max =words.length;
        }
        return max;
    }
}
