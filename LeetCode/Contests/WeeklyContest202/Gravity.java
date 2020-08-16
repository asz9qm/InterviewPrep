package LeetCode.Contests.WeeklyContest202;

import java.util.Arrays;

public class Gravity 
{
    public int maxDistance(int[] position, int m) 
    {
        Arrays.sort(position);
        int left = 1;
        int right = position[position.length-1];
        
        while(left < right)
        {
            int mid = (left + right + 1) / 2;
            if(helper(position, mid) >= m)
            {
                left = mid;
            }
            else
            {
                right = mid-1;
            }
        }
        return left;
        
        
    }
    
    private int helper(int[] position, int distance)
    {
        int count = 1;
        int index = 0;
        for(int i = 0; i < position.length; i++)
        {
            if((position[i] - position[index]) >= distance)
            {
                count++;
                index = i;
            }
        }
        return count;
    }
    
}