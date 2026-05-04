"""
Problem: 509. Fibonacci Number
Difficulty: Easy
Pattern: Recursion / Dynamic Programming

Description
The Fibonacci sequence is defined such that each number is the sum of the two preceding ones.

F(0) = 0, F(1) = 1  
F(n) = F(n - 1) + F(n - 2), for n > 1

Given an integer n, return F(n).

Example:
Input: n = 4  
Output: 3  

Explanation:
F(2) = 1 (0 + 1)  
F(3) = 2 (1 + 1)  
F(4) = 3 (2 + 1)

Approach
1. Handle base cases:
   - If n == 0 → return 0
   - If n == 1 → return 1
2. For n > 1:
   - Recursively calculate fib(n-1) and fib(n-2)
   - Return their sum
3. The recursion breaks the problem into smaller subproblems until base cases are reached.

Time Complexity: O(2^n)
    Each call makes two recursive calls → exponential growth

Space Complexity: O(n)
    Due to recursion call stack depth 
"""


class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}
