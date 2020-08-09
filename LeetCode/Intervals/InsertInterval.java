// https://leetcode.com/problems/insert-interval/
package LeetCode.Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval 
{
    public int[][] insert(int[][] intervals, int[] n) 
    {
        if (n.length == 0) 
        {
            return intervals;
        }            

        if ((intervals.length == 0))
        {
            return new int [][]{{n[0], n[1]}};
        }


        if (n[0] > intervals[intervals.length-1][1]) 
        {
            List<int []> res = new ArrayList<>(Arrays.asList(intervals));
            res.add(n);
            return res.toArray(new int[res.size()][]);
        }
        
        boolean added = false; 

        List<int []> res = new ArrayList<>();
        for (int cur[] : intervals) 
        {
            if (!added) 
            {
                if (n[1] < cur[0]) 
                {
                    res.add(n);
                    added = true;
                } 
                else if (n[0] <= cur[1]) 
                {                    
                    cur[0] = Math.min(cur[0], n[0]);
                    cur[1] = Math.max(cur[1], n[1]);
                    added = true;
                }
                res.add(cur);
            } 
            else 
            {
                int last[] = res.get(res.size()-1);
                if (last[1] < cur[0])
                    res.add(cur);
                else
                    last[1] = Math.max(cur[1], last[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}