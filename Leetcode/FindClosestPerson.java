package Leetcode;

public class FindClosestPerson {
        //Leetcode 3516: Find Closest Person
        //Time Complexity: O(1)
        //Space Complexity: O(1)
        //Simple brute force solution
        public int findClosest(int x, int y, int z) {
            int d2 = y - z;
            if (y - z < 0)
                d2 = z - y;
            int d1 = x - z;
            if (x - z < 0)
                d1 = z - x;
            if (d1 == d2)
                return 0;
            else if (d1 < d2)
                return 1;
            else
                return 2;
        }
    }

