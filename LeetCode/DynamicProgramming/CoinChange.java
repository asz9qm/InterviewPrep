// https://leetcode.com/problems/coin-change/
package LeetCode.DynamicProgramming;

import java.util.Arrays;

public class CoinChange 
{
    public int coinChange(int[] coins, int amount) 
    {
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        for(int c : coins)
        {
            for (int x = c; x < amount+1; x++)
            {
                dp[x] = Math.min(dp[x], dp[x - c]+1);
            }
        }
        if(dp[amount] == amount+1)
        {
            return -1;
        }
        else
        {
            return dp[amount];
        }
    }
    
}