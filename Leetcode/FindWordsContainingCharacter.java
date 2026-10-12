package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    // Leetcode 2942. Find Words Containing Character
    //Time Complexity: O(n*m) where n is the length of the input array and m is the average length of the words in the array.
    //Space Complexity: O(n) where n is the length of the input array.
    

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        int count =0;
        for(String word: words){
            if(word.indexOf(x)!= -1){
                list.add(count);
            }
                count++;
        }
        return list;
    }

}
