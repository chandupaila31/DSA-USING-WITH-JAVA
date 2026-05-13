"""
Problem: 349. Intersection of Two Arrays  
Difficulty: Easy  
Pattern: Hash Set  

Description  
Given two integer arrays nums1 and nums2, return an array of their intersection.

Rules:
- Each element in the result must be unique
- Result can be returned in any order

Example:
Input: nums1 = [1,2,2,1], nums2 = [2,2]  
Output: [2]

Explanation:  
2 is the only common unique element.

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]  
Output: [9,4]

Explanation:  
4 and 9 are common in both arrays.

Approach  
1. Create a HashSet set1:
   - Store all elements from nums1

2. Create another HashSet result:
   - Store common unique elements

3. Traverse nums2:
   - If element exists in set1:
       - Add it to result

4. Convert result set into int[] array.

Key Idea:
- HashSet provides:
   - Fast lookup → O(1)
   - Automatic duplicate removal

Time Complexity: O(n + m)  
    n = length of nums1  
    m = length of nums2  

Space Complexity: O(n + k)  
    n = elements stored in set1  
    k = unique intersection elements  
"""
  

import java.util.*;

class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        // store nums1 elements
        for (int n : nums1) {
            set1.add(n);
        }

        // check common elements
        for (int n : nums2) {

            if (set1.contains(n)) {
                result.add(n);
            }
        }

        // convert set to int[]
        int[] ans = new int[result.size()];

        int index = 0;

        for (int n : result) {
            ans[index++] = n;
        }

        return ans;
    }
}
