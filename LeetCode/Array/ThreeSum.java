package LeetCode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.lang.model.util.ElementScanner14;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) 
    {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>(); 
        for (int i = 0; i < nums.length-2; i++)
        {
            if(i > 0  && nums[i] == nums[i-1])
            {
                continue;
            }
            int value = 0 - nums[i];
            int lower = i + 1;
            int high = nums.length -1;
            while (lower < high)
            {
                if (nums[lower] + nums[high] == value)
                {
                    answer.add(Arrays.asList(nums[i],nums[lower],nums[high]));
                    lower++;
                    high--;
                    while(nums[lower] == nums[lower-1] && lower < nums.length-1)
                    {
                        lower++;
                    }
                    while(nums[high] == nums[high+1] && high > 0)
                    {
                        high--;
                    }
                }
                else if(nums[lower] + nums[high] > value)
                {
                    high--;
                }
                else
                {
                    lower++;
                }
            }
        }
        return answer;
    }
    
}