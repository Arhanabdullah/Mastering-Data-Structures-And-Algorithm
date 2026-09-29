package Leetcode;

public class MirrorDistanceOfInteger {
    // Leetcode 3783: Mirror Distance of Integer
    // Time Complexity: O(log n), where n is the input integer.
    // Space Complexity: O(1)
    // Brute Force solution
    public int mirrorDistance(int n) {
        int originalNumber =n;
        int  mirrorNumber =0;
        while(n>0){
            int digit=n%10;
            mirrorNumber = mirrorNumber*10+digit;
            n/=10;
        }
        if(originalNumber - mirrorNumber <0) return -(originalNumber - mirrorNumber );
        return originalNumber - mirrorNumber ;
    }
}

