"""
Problem: 506. Relative Ranks  
Difficulty: Easy  
Pattern: Sorting + Hash Map  

Description  
You are given an integer array score where score[i] represents the score of the ith athlete.

The athletes are ranked based on their scores:
- Highest score → "Gold Medal"
- 2nd highest → "Silver Medal"
- 3rd highest → "Bronze Medal"
- Remaining athletes → their rank number as a string

Return an array answer where answer[i] is the rank of the ith athlete.

Example:
Input: score = [5,4,3,2,1]  
Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]

Explanation:
- 5 → 1st place → Gold Medal
- 4 → 2nd place → Silver Medal
- 3 → 3rd place → Bronze Medal

Input: score = [10,3,8,9,4]  
Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]

Approach  
1. Clone the original array:
   - To preserve original order

2. Sort the cloned array in ascending order.

3. Traverse sorted array from end:
   - Highest score gets rank 1
   - Store:
       score → rank
   using HashMap

4. Traverse original score array:
   - Get rank from HashMap
   - Assign:
       - 1 → Gold Medal
       - 2 → Silver Medal
       - 3 → Bronze Medal
       - Else → rank number as string

5. Return result array.

Key Idea:
- Sorting determines athlete rankings.
- HashMap helps retrieve rank for original positions efficiently.

Time Complexity: O(n log n)  
    Sorting takes O(n log n)  
    Remaining traversals take O(n)  

Space Complexity: O(n)  
    Extra array, HashMap, and result array used  
"""
  
```java
class Solution {

    public String[] findRelativeRanks(int[] score) {

        String result[] = new String[score.length];

        // clone original array
        int[] arr = score.clone();

        // sort scores
        Arrays.sort(arr);

        Map<Integer, Integer> mp = new HashMap<>();

        int rank = 1;

        // assign ranks
        for (int i = arr.length - 1; i >= 0; i--) {

            mp.put(arr[i], rank);
            rank++;
        }

        // build answer
        for (int i = 0; i < score.length; i++) {

            int current = mp.get(score[i]);

            if (current == 1) {
                result[i] = "Gold Medal";
            }
            else if (current == 2) {
                result[i] = "Silver Medal";
            }
            else if (current == 3) {
                result[i] = "Bronze Medal";
            }
            else {
                result[i] = String.valueOf(current);
            }
        }

        return result;
    }
}
```
