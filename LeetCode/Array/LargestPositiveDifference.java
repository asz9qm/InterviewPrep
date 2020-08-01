// Input: [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//              Not 7-1 = 6, as selling price needs to be larger than buying price.
package LeetCode.Array;

class LargestPositiveDifference {
    public int maxProfit(int[] prices) {

        if(prices.length < 1)
        {
            return 0;
        }
        int largest = prices[0];
        int difference = 0;
        for(int i = 1; i < prices.length; i++)
        {
            if(prices[i] < largest)
            {
                largest = prices[i];
            }
            else
            {
                if(prices[i]-largest > difference)
                {
                    difference = prices[i]-largest;
                }
            }
        }
        return difference;
    }
}