// https://leetcode.com/problems/merge-intervals/
package LeetCode.Intervals;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeIntervals 
{
    private class IntervalComparator implements Comparator<int[]> 
    {
        @Override
        public int compare(int[] a, int[] b) 
        {
            if(a[0] < b[0])
            {
                return -1;
            }
            else if(a[0] == b[0])
            {
                return 0;
            }
            else
            {
                return 1;
            }
        }
    }
    
    public int[][] merge(int[][] intervals) 
    {
        Collections.sort(Arrays.asList(intervals), new IntervalComparator());
    
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) 
        {
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) 
            {
                merged.add(interval);
            }
            else 
            {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
    
        return merged.toArray(new int[merged.size()][]);
    }
    
}