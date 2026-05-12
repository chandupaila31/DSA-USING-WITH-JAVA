"""
Problem: 290. Word Pattern  
Difficulty: Easy  
Pattern: Hash Map / String Mapping  

Description  
Given a pattern and a string s, determine if s follows the same pattern.

A valid pattern means:
- Each character maps to exactly one word
- Each word maps to exactly one character
- No two characters map to the same word
- No two words map to different characters

This is called a bijection mapping.

Example:
Input: pattern = "abba", s = "dog cat cat dog"  
Output: true  

Explanation:
- 'a' → "dog"
- 'b' → "cat"

Input: pattern = "abba", s = "dog cat cat fish"  
Output: false  

Explanation:
'b' should map to "cat", but found "fish".

Input: pattern = "aaaa", s = "dog cat cat dog"  
Output: false  

Explanation:
'a' cannot map to multiple words.

Approach  
1. Split the string using spaces:
   - s.split(" ")

2. Check:
   - If pattern length != number of words
   - Return false

3. Use:
   - HashMap<Character, String> for character → word mapping
   - HashSet<String> to track already used words

4. Traverse pattern and words together:
   - If character already mapped:
       - Check if mapped word matches current word
       - If not → return false
   - Else:
       - Check if word already mapped to another character
       - If yes → return false
       - Otherwise create new mapping

5. Return true if all mappings are valid.

Key Idea:
- Ensure one-to-one mapping between characters and words.

Time Complexity: O(n)  
    n = number of characters/words  

Space Complexity: O(n)  
    HashMap and HashSet store mappings  
"""

class Solution {

    public boolean wordPattern(String pattern, String s) {

        String[] str = s.split(" ");

        // length mismatch
        if (pattern.length() != str.length) {
            return false;
        }

        Map<Character, String> mp = new HashMap<>();

        // to track used words
        Set<String> usedWords = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = str[i];

            // character already mapped
            if (mp.containsKey(ch)) {

                // mapping must match
                if (!mp.get(ch).equals(word)) {
                    return false;
                }

            } else {

                // word already mapped
                if (usedWords.contains(word)) {
                    return false;
                }

                // create mapping
                mp.put(ch, word);
                usedWords.add(word);
            }
        }

        return true;
    }
}
