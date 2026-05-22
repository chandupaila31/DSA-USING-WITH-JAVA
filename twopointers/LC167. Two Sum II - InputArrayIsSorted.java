"""
Problem: 167. Two Sum II - Input Array Is Sorted  
Difficulty: Medium  
Pattern: Two Pointers  

Description  
Given a 1-indexed sorted array numbers and a target value, find two numbers such that they add up to target.

Return the indices of the two numbers as:
[index1, index2]

Rules:
- Array is sorted in non-decreasing order
- Exactly one solution exists
- Cannot use the same element twice
- Must use only constant extra space

Example:
Input: numbers = [2,7,11,15], target = 9  
Output: [1,2]

Explanation:  
2 + 7 = 9

Input: numbers = [2,3,4], target = 6  
Output: [1,3]

Explanation:  
2 + 4 = 6

Input: numbers = [-1,0], target = -1  
Output: [1,2]

Explanation:  
-1 + 0 = -1

Approach  
1. Use two pointers:
   - i = 0 (start)
   - j = numbers.length - 1 (end)

2. Traverse while i < j:
   - Calculate sum = numbers[i] + numbers[j]

3. Cases:
   - If sum == target:
       - Return indices (i + 1, j + 1)
   - If sum > target:
       - Decrease j
   - Else:
       - Increase i

4. Since array is sorted:
   - Moving pointers helps efficiently find target sum.

Key Idea:
- Sorted array allows using Two Pointer technique.
- Avoids extra space like HashMap.

Time Complexity: O(n)  
    Each pointer moves at most once through array  

Space Complexity: O(1)  
    Constant extra space used  
"""
```java
class Solution {

    public int[] twoSum(int[] numbers, int target) {

        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {

            int sum = numbers[i] + numbers[j];

            if (sum == target) {

                return new int[] { i + 1, j + 1 };
            }
            else if (sum > target) {

                j--;
            }
            else {

                i++;
            }
        }

        return new int[] {};
    }
}
```
