"""
Problem: 162. Find Peak Element  
Difficulty: Medium  
Pattern: Binary Search  

Description  
A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, return the index of any peak element.

You may assume:
- nums[-1] = -∞
- nums[n] = -∞

This means the first or last element can also be a peak.

You must solve it in O(log n) time.

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
1. Initialize:
   - low = 0
   - high = n - 1

2. Perform Binary Search:
   - Find middle index mid
   - Compare nums[mid] with nums[mid + 1]

3. Cases:
   - If nums[mid] > nums[mid + 1]:
       - Peak exists in left half including mid
       - Move high = mid
   - Else:
       - Peak exists in right half
       - Move low = mid + 1

4. Continue until low == high.

5. Return low (or high), which will be the peak index.

Key Idea:
- If sequence is decreasing:
   - Peak lies on left side
- If sequence is increasing:
   - Peak lies on right side
- Binary Search helps reduce search space efficiently.

Time Complexity: O(log n)  
    Binary search reduces search space by half each iteration  

Space Complexity: O(1)  
    No extra space used  
"""
```java
class Solution {

    public int findPeakElement(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {

            int mid = (low + high) / 2;

            if (nums[mid] > nums[mid + 1]) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }

        return low;
    }
}
```
