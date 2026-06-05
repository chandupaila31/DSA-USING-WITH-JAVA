"""
Problem: 520. Detect Capital  
Difficulty: Easy  
Pattern: String Traversal / Character Counting  

Description  
We define the usage of capitals in a word to be correct if one of the following conditions is satisfied:

1. All letters are uppercase.
   - Example: "USA"

2. All letters are lowercase.
   - Example: "leetcode"

3. Only the first letter is uppercase.
   - Example: "Google"

Return true if the usage of capitals is correct; otherwise, return false.

Example:
Input: word = "USA"  
Output: true

Explanation:  
All letters are uppercase.

Input: word = "FlaG"  
Output: false

Explanation:  
Only some letters are uppercase, which does not match any valid pattern.

Approach  
1. Count the number of uppercase letters in the word.
2. Store the first character separately.
3. Traverse the string:
   - If a character is uppercase, increment count.
4. After counting, check:
   - If all letters are uppercase → valid
   - If no letters are uppercase → valid
   - If exactly one letter is uppercase and it is the first character → valid
5. Otherwise, return false.

Key Idea:
- Count uppercase letters and verify whether the word matches one of the three valid capitalization patterns.

Time Complexity: O(n)  
    Traverse the string once  

Space Complexity: O(1)  
    Only a few variables are used  

"""
```java
class Solution {

    public boolean detectCapitalUse(String word) {

        int uppercount = 0;
        char firstChar = word.charAt(0);

        for (char ch : word.toCharArray()) {

            if (Character.isUpperCase(ch)) {
                uppercount++;
            }
        }

        if (uppercount == word.length() ||
            uppercount == 0 ||
            (uppercount == 1 && Character.isUpperCase(firstChar))) {

            return true;
        }
        return false;
    }
}
```
