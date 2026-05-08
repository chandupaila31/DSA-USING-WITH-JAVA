"""
Problem: 162. Find Peak Element  
Difficulty: Medium  
Pattern: Array Traversal / Binary Search  

Description  
A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, return the index of any peak element.

You may assume:
- nums[-1] = -∞
- nums[n] = -∞

This means the first or last element can also be a peak.

Example:
Input: nums = [1,2,3,1]  
Output: 2  

Explanation:  
3 is greater than both neighbors, so index 2 is a peak.

Input: nums = [1,2,1,3,5,6,4]  
Output: 5  

Explanation:  
6 is greater than both neighbors, so index 5 is a peak.

Approach  
1. Traverse the array from left to right.
2. For every element:
   - Find left neighbor
   - Find right neighbor
3. If current element is greater than both neighbors:
   - Return its index
4. Use Integer.MIN_VALUE for boundary cases:
   - First element has no left neighbor
   - Last element has no right neighbor

Key Idea:
- Compare each element with its adjacent elements.
- Return the first peak found.

Time Complexity: O(n)  
    Traverse the array once  

Space Complexity: O(1)  
    No extra space used  
""" 


class Solution {
    public int findPeakElement(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int left = (i == 0) ? Integer.MIN_VALUE : nums[i - 1];
            int right = (i == nums.length - 1) ? Integer.MIN_VALUE : nums[i + 1];

            if (nums[i] > left && nums[i] > right) {
                return i;
            }
        }

        return 0;
    }
}


Note:
// - The problem asks for O(log n) solution using Binary Search.
// - Your current solution works correctly but has O(n) time complexity.
