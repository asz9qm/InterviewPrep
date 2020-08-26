package LeetCode.Array;

public class BestTimeToBuySell 
{
    public int maxProfit(int[] prices) 
    {
        if(prices.length < 2)
        {
            return 0;
        }
        int min = prices[0];
        int sell = 0;
        for(int i = 0; i < prices.length; i++)
        {
            if(prices[i] < min)
            {
                min = prices[i];
            }
            if(prices[i] - min > sell)
            {
                sell = prices[i] - min;
            }
        }
        return sell;
        
    }
    
}