// https://leetcode.com/problems/jump-game/

package LeetCode.DynamicProgramming;

public class JumpGame 
{
    public boolean canJump(int[] nums) 
    {
        int current = nums.length-1;
        for(int i = nums.length-2; i >= 0; i--)
        {
            if (i + nums[i] >= current)
            {
                current = i;
            }
        }
        return current == 0;
    }
    
}