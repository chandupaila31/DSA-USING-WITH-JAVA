"""
Problem: 434. Number of Segments in a String  
Difficulty: Easy  
Pattern: String Traversal  

Description  
Given a string s, return the number of segments in the string.

A segment is defined as a contiguous sequence of non-space characters.

Example:
Input: s = "Hello, my name is John"  
Output: 5  

Explanation:  
The five segments are:
["Hello,", "my", "name", "is", "John"]

Input: s = "Hello"  
Output: 1  

Explanation:  
Only one word is present.

Approach  
1. Initialize count = 0.
2. Traverse the string character by character.
3. A new segment starts when:
   - Current character is not a space
   - AND:
       - It is the first character
       - OR previous character is a space
4. Increment count whenever a new segment starts.
5. Return count.

Key Idea:
- Count only the starting character of each word.
- Avoid counting spaces multiple times.

Time Complexity: O(n)  
    Traverse the string once  

Space Complexity: O(1)  
    No extra space used 
"""


class Solution {
    public int countSegments(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ' &&
               (i == 0 || s.charAt(i - 1) == ' ')) {

                count++;
            }
        }

        return count;
    }
}
