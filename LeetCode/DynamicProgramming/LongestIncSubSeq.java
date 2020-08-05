// https://leetcode.com/problems/longest-increasing-subsequence/
package LeetCode.DynamicProgramming;

public class LongestIncSubSeq 
{
    public int lengthOfLIS(int[] nums) 
    {
        int[] values = new int[nums.length];
        values[0] = nums[0];
        int length = 1;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] < values[0])
            {
                values[0] = nums[i];
            }
            else if(nums[i] > values[length-1])
            {
                values[length] = nums[i];
                length++;
            }
            else
            {
                values[binarySearch(nums, -1, length-1, nums[i])] = nums[i];
            }
        }
        return length;
    }

    private int binarySearch(int[] nums, int l, int r, int key)
    {
        while(r - l > 1)
        {
            int mid = (r + l) / 2;
            if(key > nums[mid])
            {
                l = mid;
            }
            else
            {
                r = mid;
            }
        }
        return r;
    }

    
}