//https://leetcode.com/problems/non-overlapping-intervals/
package LeetCode.Intervals;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class NonOverlapping 
{
    private class IntervalComparator implements Comparator<int[]>
    {
        @Override
        public int compare(int[] a, int[] b) 
        {
            if(a[1] < b[1])
            {
                return -1;
            }
            else if(a[1] == b[1])
            {
                return 0;
            }
            else
            {
                return 1;
            }
        }
    }

    public int eraseOverlapIntervals(int[][] intervals) 
    {

        if(intervals.length == 0)
        {
            return 0;
        }

        Collections.sort(Arrays.asList(intervals), new IntervalComparator());

        int end = intervals[0][1];
        int count = 1;

        for(int i = 1; i < intervals.length; i++)
        {
            if(intervals[i][0] >= end)
            {
                count++;
                end = intervals[i][1];
            }
        }

        return intervals.length - count;


        
    }
    
}