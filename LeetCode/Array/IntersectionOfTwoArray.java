// https://leetcode.com/problems/intersection-of-two-arrays-ii/
package LeetCode.Array;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArray 
{
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : nums1)
        {
            if(map.containsKey(i))
            {
                map.put(i, map.get(i)+1);
            }
            else
            {
                map.put(i, 1);
            }
        }
        
        for(int i : nums2)
        {
            if(map.containsKey(i) && map.get(i) > 0)
            {
                arr.add(i);
                map.put(i, map.get(i)-1);
            }
        }
        
        int[] answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++)
        {
            answer[i] = arr.get(i);
        }
        return answer;
    }
    
}