// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
package LeetCode.Array;

public class FindSingle
{
    public int singleNumber(int[] nums) 
    {
        int single = 0;
        for(int i : nums)
        {
            single ^= i;
        }
        return single;
        
    }
}
