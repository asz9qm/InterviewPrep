// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
package LeetCode.Array;

public class RemoveDuplicates 
{
    public int removeDuplicates(int[] nums) 
    {
        if(nums.length <= 0)
        {
            return 0;
        }
        
        int size = 0;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[size] != nums[i])
            {
                size++;
                nums[size] = nums[i];
            }
        }
        return size+1;
        
    }
    
}