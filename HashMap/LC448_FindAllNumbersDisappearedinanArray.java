"""
Problem: 448. Find All Numbers Disappeared in an Array  
Difficulty: Easy  
Pattern: Hash Map / Frequency Counting  

Description  
Given an integer array nums of size n where nums[i] is in the range [1, n], return all the numbers in the range [1, n] that do not appear in nums.

Example:
Input: nums = [4,3,2,7,8,2,3,1]  
Output: [5,6]

Explanation:  
Numbers from 1 to 8 are expected.  
5 and 6 are missing in the array.

Input: nums = [1,1]  
Output: [2]

Explanation:  
Number 2 is missing.

Approach  
1. Create a HashMap to store frequency of elements.
2. Traverse nums:
   - Store each number in the map.
3. Create a result list.
4. Traverse numbers from 1 to n:
   - If number is not present in map:
       - Add it to result.
5. Return result list.

Key Idea:
- Store existing numbers using HashMap.
- Missing numbers are those not present in the map.

Time Complexity: O(n)  
    One traversal for storing frequencies and another traversal from 1 to n  

Space Complexity: O(n)  
    HashMap stores array elements  

"""
```java
class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        Map<Integer, Integer> mp = new HashMap<>();

        // store frequencies
        for (int i = 0; i < nums.length; i++) {

            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        // find missing numbers
        for (int i = 1; i <= nums.length; i++) {

            if (!mp.containsKey(i)) {
                result.add(i);
            }
        }

        return result;
    }
}
```
