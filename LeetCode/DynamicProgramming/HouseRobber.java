// https://leetcode.com/problems/house-robber/
package LeetCode.DynamicProgramming;

public class HouseRobber 
{
    public int rob(int[] nums) 
    {
        if (nums.length == 0)
        {
            return 0;
        }
        int prev = 0;
        int prev2 = 0;
        for(int num : nums)
        {
            int temp = prev;
            prev = Math.max(prev2 + num, prev);
            prev2 = temp;
        }
        return prev;
    }
    
}