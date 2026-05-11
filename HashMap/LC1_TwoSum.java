"""
Problem: 1. Two Sum  
Difficulty: Easy  
Pattern: Hash Map  

Description  
Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to target.

You may assume:
- Exactly one solution exists
- Same element cannot be used twice

You can return the answer in any order.

Example:
Input: nums = [2,7,11,15], target = 9  
Output: [0,1]  

Explanation:  
nums[0] + nums[1] = 2 + 7 = 9

Input: nums = [3,2,4], target = 6  
Output: [1,2]

Input: nums = [3,3], target = 6  
Output: [0,1]

Approach  
1. Create a HashMap to store:
   - number → index

2. Traverse the array:
   - Find complement:
       complement = target - nums[i]

3. Check:
   - If complement already exists in HashMap:
       - Return indices
   - Else:
       - Store current number and index in map

4. Since exactly one solution exists, return answer immediately when found.

Key Idea:
- Use HashMap for fast lookup.
- Avoid nested loops by storing previously seen numbers.

Time Complexity: O(n)  
    Traverse array once and HashMap operations take O(1) average time  

Space Complexity: O(n)  
    HashMap stores array elements  
"""

class Solution {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int sum = target - nums[i];

            if (mp.containsKey(sum)) {
                return new int[] { mp.get(sum), i };
            }

            mp.put(nums[i], i);
        }

        return new int[] {};
    }
}
