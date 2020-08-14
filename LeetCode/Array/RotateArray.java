package LeetCode.Array;

public class RotateArray 
{
    public void rotate(int[] nums, int k) 
    {
        k = k % nums.length;
        swap(nums, 0, nums.length-1);
        swap(nums, 0, k-1);
        swap(nums, k, nums.length-1);
        
    }
    
    public void swap(int[] nums, int start, int end)
    {
        int temp = 0;
        while(start < end)
        {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
}