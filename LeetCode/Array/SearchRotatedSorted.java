// https://leetcode.com/problems/search-in-rotated-sorted-array/
package LeetCode.Array;

public class SearchRotatedSorted 
{

    public int search(int[] nums, int target) 
    {
        if(nums.length == 0)
        {
            return -1;
        }
        int pivot = findPivot(nums, 0, nums.length-1);
        if(pivot == -1)
        {
            return binarySearch(nums, 0, nums.length-1, target);
        }
        else if(nums[pivot] == target)
        {
            return pivot;
        }
        else if(nums[0] <= target)
        {
            return binarySearch(nums, 0, pivot-1, target);
        }
        else
        {
            return binarySearch(nums, pivot+1, nums.length-1, target);
        }

    }

    public int findPivot(int[] nums, int low, int high) {
        if (high < low) 
        {
            return -1; 
        }            
        if (high == low) 
        {
            return low; 
        }            
  
        int mid = (low + high) / 2; 
        if (mid < high && nums[mid] > nums[mid + 1]) 
        {
            return mid; 
        }
        if (mid > low && nums[mid] < nums[mid - 1]) 
        {
            return (mid - 1); 
        }
        if (nums[low] >= nums[mid]) 
        {
            return findPivot(nums, low, mid - 1); 
        }
        return findPivot(nums, mid + 1, high);
    }

    public int binarySearch(int[] nums, int low, int high, int target)
    {
        if(high < low)
        {
            return -1;
        }
        int mid = (low + high) / 2;
    
        if(nums[mid] == target)
        {
            return mid;
        }
        else if(nums[mid] > target)
        {
            return binarySearch(nums, low, mid-1, target);
        }
        else
        {
            return binarySearch(nums, mid+1, high, target);
        }

    }

    
}