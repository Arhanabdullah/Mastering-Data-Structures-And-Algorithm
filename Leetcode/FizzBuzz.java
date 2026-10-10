package Leetcode;
import java.util.List;
import java.util.ArrayList;

public class FizzBuzz {
    // Leetcode 412. Fizz Buzz
    // Time Complexity: O(n) where n is the input number.
    // Space Complexity: O(n)
    // Brute force solution
        public List<String> fizzBuzz(int n) {
            List<String> str = new ArrayList<>();
            for(int i =1;i<=n;i++){
                if(i%3 ==0 && i%5 ==0) str.add("FizzBuzz");
                else if(i%3==0) str.add("Fizz");
                else if(i%5==0) str.add("Buzz");
                else {
                    String num = Integer.toString(i);
                    str.add(num);
                }
            }
            return str;
        }
    }

