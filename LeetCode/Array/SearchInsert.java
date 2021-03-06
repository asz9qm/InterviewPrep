// https://leetcode.com/problems/search-insert-position/
package LeetCode.Array;

public class SearchInsert 
{
    public int searchInsert(int[] nums, int target) 
    {
        int left = 0;
        int right = nums.length;
        while(left < right)
        {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] >= target)
            {
                right = mid;
            }
            else
            {
                left = mid+1;
            }
            
        }
        return left;
        
    }    
}