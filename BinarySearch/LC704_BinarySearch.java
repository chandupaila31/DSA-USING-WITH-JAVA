"""
Problem: 704. Binary Search  
Difficulty: Easy  
Pattern: Binary Search  

Description  
Given a sorted array of integers nums (in ascending order) and an integer target, return the index of target if it exists. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

Example:
Input: nums = [-1,0,3,5,9,12], target = 9  
Output: 4  

Explanation:  
9 exists in nums and its index is 4  

Input: nums = [-1,0,3,5,9,12], target = 2  
Output: -1  

Explanation:  
2 does not exist in nums  

Approach  
1. Initialize two pointers:
   - low = 0  
   - high = n - 1  
2. Run a loop while low <= high  
3. Find middle index:
   - mid = (low + high) / 2  
4. Compare nums[mid] with target:
   - If equal → return mid  
   - If nums[mid] > target → search left half (high = mid - 1)  
   - Else → search right half (low = mid + 1)  
5. If not found, return -1  

Time Complexity: O(log n)  
    Each step reduces search space by half  

Space Complexity: O(1)  
    No extra space used  
  """

class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
