// https://leetcode.com/problems/maximum-product-subnumsay/
package LeetCode.Array;

public class MPCS 
{
    public int maxProduct(int[] nums) 
    {
        int min = nums[0]; 
        int max = nums[0]; 
  
        int maxProduct = nums[0]; 
  
        for (int i = 1; i < nums.length; i++) { 
  
            if (nums[i] < 0) 
            {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(nums[i], max * nums[i]); 
            min = Math.min(nums[i], min * nums[i]); 
  
            maxProduct = Math.max(maxProduct, max); 
        } 
  
        return maxProduct; 
  
    }
    
}