package LeetCode.Contests.BiweeklyContest33;

public class MinOpsTarget 
{
    public int minOperations(int[] nums) 
    {
        int count = 0;
        while(isZero(nums))
        {
            int i = isOdd(nums, 0);
            while(i != -1)
            {
                nums[i]--;
                count++;
                i = isOdd(nums, i);
            }
            if(isZero(nums))
            {
                for(int j = 0; j < nums.length; j++)
                {
                    nums[j] /= 2;
                } 
                count++;
            }

            
        }
        return count;
           
        
        
    }
    
    private int isOdd(int[] nums, int s)
    {
        for(int i = s; i < nums.length; i++)
        {
            if(nums[i] % 2 != 0)
            {
                return i;
            }
        }
        return -1;
    }
    
    private boolean isZero(int[] nums)
    {
        for(int i: nums)
        {
            if(i != 0)
            {
                return true;
            }
        }
        return false;
    }
    
}