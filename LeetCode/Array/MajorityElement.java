// https://leetcode.com/problems/majority-element-ii/
package LeetCode.Array;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MajorityElement {

    public List<Integer> majorityElement(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int a : nums) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        List<Integer> results = new LinkedList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
        {
            if(entry.getValue() > nums.length / 3)
            {
                results.add(entry.getKey());
            }
        }
        return results;
        
    }

    public List<Integer> majorityElementConstant(int[] nums) 
    {
        List<Integer> results = new LinkedList<>();
        int a = 0;
        int b = 1;
        int aCount = 0;
        int bCount = 0;

        for (int n : nums)
        {
            if(n == a)
            {
                aCount++;
            }
            else if(n == b)
            {
                bCount++;
            }
            else if(aCount == 0)
            {
                a = n;
                aCount = 1;
            }
            else if(bCount == 0)
            {
                b = n;
                bCount = 1;
            }
            else 
            {
                aCount--;
                bCount--;
            }
        }  
        if(count(nums, a) > (nums.length / 3) )
        {
            results.add(a);
        }
        if(count(nums, b) > (nums.length / 3) )
        {
            results.add(b);
        }
        return results;
        
    }
    private int count(int[] nums, int value)
    {
        int i = 0;
        for(int n : nums)
        {
            if(n == value)
            {
                i++;
            }
        }
        return i;
    }
}