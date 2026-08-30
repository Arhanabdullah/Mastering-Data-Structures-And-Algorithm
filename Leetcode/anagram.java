package Leetcode;

//Leetcode 242. Valid Anagram
//Time Complexity: O(n log n)  Space Complexity: O(n)
//Sorting solution to check if two strings are anagrams of each other
//This solution sorts the characters of both strings and compares them for equality
//Not the brute force solution, but a more efficient approach using sorting
import java.util.Arrays;

public class anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String sSorted = new String(arr1);
        String tSorted = new String(arr2);
        return sSorted.equals(tSorted);
    }
}
