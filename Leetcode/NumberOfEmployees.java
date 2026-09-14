package Leetcode;

public class NumberOfEmployees {
//Leetcode 2798. Number of Employees Who Met the Target
//Time Complexity: O(n)
//Space Complexity: O(1)
//Given an array of integers hours and an integer target, return the number of employees who worked at least target hours.

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target)
                count++;
        }
        return count;
    }
}

