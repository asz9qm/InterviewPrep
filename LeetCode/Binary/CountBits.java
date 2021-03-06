// https://leetcode.com/problems/counting-bits/
package LeetCode.Binary;

public class CountBits 
{
    public int[] countBits(int num) 
    {
        int[] result = new int[num + 1];
        for (int i=1; i<=num; i++)
        {
            result[i] = result[i >> 1] + (i & 1);
        } 
        return result;
    }
    
}