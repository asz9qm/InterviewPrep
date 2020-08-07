// https://leetcode.com/problems/unique-paths/
package LeetCode.DynamicProgramming;

import java.util.Arrays;

public class Paths 
{
    public int uniquePaths(int m, int n) 
    {
        //wants m to be the smaller one
        if(n < m)
        {
            return uniquePaths(n, m);
        }
        int[] dp = new int[m];
        Arrays.fill(dp, 1);
        int temp = 1;
        for(int i = 1; i < n; i++)
        {
            for(int j = 1; j < m; j++)
            {
                temp = dp[j];
                dp[j] = temp + dp[j-1];
            }
        }
        return dp[m-1];
    }
    
}