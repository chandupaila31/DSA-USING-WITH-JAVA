"""
Problem: 744. Find Smallest Letter Greater Than Target  
Difficulty: Easy  
Pattern: Binary Search  

Description  
You are given a sorted array of characters letters and a target character target.

Return the smallest character in letters that is lexicographically greater than target.  
If no such character exists, return the first character in the array.

Example:
Input: letters = ["c","f","j"], target = 'a'  
Output: 'c'  

Explanation:  
The smallest letter greater than 'a' is 'c'.

Input: letters = ["c","f","j"], target = 'c'  
Output: 'f'  

Explanation:  
The smallest letter greater than 'c' is 'f'.

Input: letters = ["x","x","y","y"], target = 'z'  
Output: 'x'  

Explanation:  
There is no character greater than 'z', so return the first character.

Approach  
1. Initialize:
   - left = 0
   - right = letters.length - 1
   - ans = letters[0] (default answer for wrap-around case)

2. Perform Binary Search:
   - Find middle index mid
   - If letters[mid] > target:
       - Store it as possible answer
       - Search left half for smaller valid character
   - Else:
       - Search right half

3. Return ans after loop ends.

Key Idea:
- We need the smallest character greater than target.
- Binary Search helps find it efficiently in sorted array.

Time Complexity: O(log n)  
    Binary search reduces search space by half each iteration  

Space Complexity: O(1)  
    No extra space used  
"""

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int left = 0;
        int right = letters.length - 1;

        char ans = letters[0];

        while (left <= right) {

            int mid = (left + right) / 2;

            if (letters[mid] > target) {
                ans = letters[mid];
                right = mid - 1;
            } 
            else {
                left = mid + 1;
            }
        }

        return ans;
    }
}
