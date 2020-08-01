// Given an array of integers, find if the array contains any duplicates.

// Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
package LeetCode.Array;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                return true;
            }
            else
            {
                map.put(nums[i], 0);
            }
        }
        return false;
    }
    
}