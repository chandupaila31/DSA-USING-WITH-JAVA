"""
Problem: 153. Find Minimum in Rotated Sorted Array  
Difficulty: Medium  
Pattern: Binary Search  

Description  
Suppose an array sorted in ascending order is rotated between 1 and n times.

Given the rotated sorted array nums containing unique elements, return the minimum element.

You must write an algorithm with O(log n) time complexity.

Example:
Input: nums = [3,4,5,1,2]  
Output: 1  

Explanation:  
Original array was [1,2,3,4,5] rotated 3 times.

Input: nums = [4,5,6,7,0,1,2]  
Output: 0  

Explanation:  
Original array was [0,1,2,4,5,6,7] rotated 4 times.

Input: nums = [11,13,15,17]  
Output: 11  

Explanation:  
Array is already sorted, so first element is minimum.

Approach  
1. Initialize:
   - low = 0
   - high = n - 1

2. Perform Binary Search:
   - Find mid index
   - Compare nums[mid] with nums[high]

3. Cases:
   - If nums[mid] > nums[high]:
       - Minimum lies in right half
       - Move low = mid + 1
   - Else:
       - Minimum lies in left half including mid
       - Move high = mid

4. Continue until low == high.

5. Return nums[low].

Key Idea:
- In rotated sorted array:
   - One half is always sorted.
   - Minimum element lies in the unsorted part.

Time Complexity: O(log n)  
    Binary search reduces search space by half each iteration  

Space Complexity: O(1)  
    No extra space used  
"""
  

class Solution {
    public int findMin(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {

            int mid = (low + high) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }

        return nums[low];
    }
}
