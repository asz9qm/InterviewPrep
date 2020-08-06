// https://leetcode.com/problems/house-robber-ii/
package LeetCode.DynamicProgramming;

public class HouseRobberTwo 
{
    public int rob(int[] nums) 
    {
        if (nums.length == 0)
        {
            return 0;
        }
        return Math.max(robHelper(nums, 0, nums.length-1), robHelper(nums, 1, nums.length));
    }

    public int robHelper(int[] nums, int start, int end) 
    {
        
        if(start - end == 0)
        {
            return nums[0];
        }
        int prev = 0;
        int prev2 = 0;
        for(int i = start; i < end; i ++)
        {
            int temp = prev;
            prev = Math.max(prev2 + nums[i], prev);
            prev2 = temp;
        }
        return prev;
    }
    
}