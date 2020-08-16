package LeetCode.Contests.WeeklyContest202;

import java.util.HashMap;
import java.util.Map;

public class Oranges 
{
    public int minDays(int n) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 2);
        return helper(n, map);
    }
    
    private int helper(int n, Map<Integer, Integer> map) 
    {
        if(map.containsKey(n))
        {
            return map.get(n);
        }
        int a = n;
        if(n % 2 == 0) 
        {
            a = Math.min(a, 1 + helper(n / 2, map));
        } else 
        {
            a = Math.min(a, 1 + helper(n - 1, map));
        }
        if(n % 3 == 0) 
        {
            a = Math.min(a, 1 + helper(n / 3, map));
        } else if(n % 3 == 1) 
        {
            a = Math.min(a, 1 + helper(n - 1, map));
        } else 
        {
            a = Math.min(a, 2 + helper(n - 2, map));
        }
        map.put(n, a);
        return a;
    }
    
}