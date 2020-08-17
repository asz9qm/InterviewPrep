// https://leetcode.com/problems/remove-element/
package LeetCode.Array;

public class RemoveElement 
{
    public int removeElement(int[] nums, int val) 
    {
        int i = 0;
        int size = nums.length;
        while(i < size)
        {
            if(nums[i] == val)
            {
                nums[i] = nums[size-1];
                size--;
            }
            else
            {
                i++;
            }
        }
        return size;
    }
    
}