// https://leetcode.com/problems/missing-number/
package LeetCode.Binary;

public class MissingNumber 
{
    public int missingNumber(int[] nums) 
    {
        int total = nums.length*(nums.length+1) / 2;
        int missing = 0;
        for (int i : nums)
        {
            missing += i;
        }
        return total-missing;
        
    }
    
}