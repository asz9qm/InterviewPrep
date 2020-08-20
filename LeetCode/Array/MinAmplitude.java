package LeetCode.Array;

import java.util.Arrays;

// https://leetcode.com/discuss/interview-question/553399/
public class MinAmplitude 
{
    /**
     * finds min amplitude after changing n elements
     * @param arr the array to find min size
     * @param n number of elements that can be changed
     * @return
     */
    public int minAmp(int[] arr, int n)
    {
        if(arr.length < n)
        {
            return 0;
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int size = arr.length-1;
        for(int i = 0; i < n; i++)
        {
            min = Math.min(min, arr[size-i]-arr[i]);
        }
        return min;

    }
    
}