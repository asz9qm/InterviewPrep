// https://leetcode.com/problems/climbing-stairs/
package LeetCode.DynamicProgramming;

public class Stairs 
{
    public int climbStairs(int n) 
    {
        if(n == 1)
        {
            return 1;
        }
        int[] answerArray = new int[n+1];
        
        answerArray[0] = 0;
        answerArray[1] = 1;
        answerArray[2] = 2;
        for (int i = 3; i <= n; i++)
        {
            answerArray[i] = answerArray[i-1] + answerArray[i-2];
        }
        return answerArray[n];
    }
    
}