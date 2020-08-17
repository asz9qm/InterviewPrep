// https://leetcode.com/problems/combination-sum/
package LeetCode.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumOne 
{
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates);
        solve(results, new ArrayList<>(), candidates, target, 0);
        return results;
        
    }
    
    private void solve(List<List<Integer>> results, List<Integer> temp, int[] candidates,
                      int remainder, int start)
    {
        if(remainder < 0)
        {
            return;
        }
        else if(remainder == 0)
        {
            results.add(new ArrayList<>(temp));
        }
        else
        {
            for(int i = start; i < candidates.length; i++)
            {
                temp.add(candidates[i]);
                solve(results, temp, candidates, remainder-candidates[i], i);
                temp.remove(temp.size()-1);
            }
        }
    }
    
}