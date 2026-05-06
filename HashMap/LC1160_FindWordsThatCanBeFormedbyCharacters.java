"""
Problem: 1160. Find Words That Can Be Formed by Characters  
Difficulty: Easy  
Pattern: Hash Map / Frequency Counting  

Description  
You are given an array of strings words and a string chars.

A string is good if it can be formed using characters from chars.  
Each character in chars can only be used once for each word.

Return the sum of lengths of all good strings in words.

Example:
Input: words = ["cat","bt","hat","tree"], chars = "atach"  
Output: 6  

Explanation:  
"cat" → valid  
"hat" → valid  
"bt" → invalid  
"tree" → invalid  

Total length = 3 + 3 = 6

Approach  
1. Store frequency of characters from chars in a HashMap.  
2. Traverse each word in words:
   - Create a new HashMap for current word frequency.
   - Count each character in the word.
   - Compare word frequency with chars frequency.
   - If any character count exceeds available count → mark invalid.
3. If the word is valid:
   - Add its length to freq.
4. Return final freq.

Time Complexity: O(n * k)  
    n = number of words  
    k = average length of each word  

Space Complexity: O(1)  
    HashMaps store at most 26 lowercase English letters  
"""
class Solution {
    public int countCharacters(String[] words, String chars) {

        Map<Character, Integer> mp = new HashMap<>();

        // Store frequency of chars
        for (int i = 0; i < chars.length(); i++) {
            char ch = chars.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        int freq = 0;

        // Check each word
        for (String word : words) {

            Map<Character, Integer> map = new HashMap<>();
            boolean isvalid = true;

            for (char c : word.toCharArray()) {

                map.put(c, map.getOrDefault(c, 0) + 1);

                // If frequency exceeds available chars
                if (map.get(c) > mp.getOrDefault(c, 0)) {
                    isvalid = false;
                    break;
                }
            }

            // Add valid word length
            if (isvalid) {
                freq += word.length();
            }
        }

        return freq;
    }
}
