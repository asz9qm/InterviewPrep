package LeetCode.Contests.WeeklyContest203;

import java.util.Arrays;

public class MostCoins 
{
    public int maxCoins(int[] piles) 
    {
        Arrays.sort(piles);
        int count = piles.length / 3;
        int total = 0;
        int loc = piles.length - 2;
        while(count > 0)
        {
            total += piles[loc];
            loc -= 2;
            count--;
        }
        return total;
        
    }
    
}