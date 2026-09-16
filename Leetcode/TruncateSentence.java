package Leetcode;

public class TruncateSentence {
    //1816. Truncate Sentence
    //Time Complexity: O(n^2)
    //Space Complexity: O(n)
    //Approach 1
    //Not optimal solution, but works. Split the string into words and then concatenate the first k words to form the answer.
    
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        String ans="";
        for(int i = 0; i<k;i++){
            ans = ans + " "+words[i];
            
        }
        return ans.trim();
    }

    //Approach 2
    //Optimal solution, we can iterate through the string and count the number of spaces. When we reach k spaces, we can return the substring from the start to the current index.
    public String truncateSentenceOptimal(String s, int k) {
        int count = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
            if(count==k){
                return s.substring(0,i);
            }
        }
        return s;
    }
}

