// https://leetcode.com/problems/longest-consecutive-sequence/

package LeetCode.Array;

import java.util.HashSet;

public class LongestConsecutiveSequence 
{
    public int longestConsecutive(int[] nums) 
    {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums)
        {
            set.add(n);
        }

        int streak = 0;
        
        for(int a : set)
        {
            if(!set.contains(a-1))
            {
                int cur = a;
                int curstreak = 1;

                while(set.contains(cur+1))
                {
                    cur = cur+1;
                    curstreak++;
                }
                streak = Math.max(curstreak, streak);
            }
        }

        return streak;
        
    }
    
}