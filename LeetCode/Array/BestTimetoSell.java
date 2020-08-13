// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
package LeetCode.Array;

public class BestTimetoSell 
{
    public int maxProfit(int[] prices) 
    {
        int amount = 0;
        for(int i = 0; i < prices.length-1; i++)
        {
            if(prices[i+1] > prices[i])
            {
                amount += prices[i+1] - prices[i];
            }
        }
        return amount;
        
    }
    
}