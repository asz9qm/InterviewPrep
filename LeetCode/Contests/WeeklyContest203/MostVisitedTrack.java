package LeetCode.Contests.WeeklyContest203;

import java.util.LinkedList;
import java.util.List;

public class MostVisitedTrack 
{
    public List<Integer> mostVisited(int n, int[] rounds) 
    {
        List<Integer> answer = new LinkedList<>();
        if(rounds.length < 2)
        {
            answer.add(rounds[0]);
            return answer;
        }
        int[] score = new int[n];
        int prev = rounds[0];
        for(int i = 1; i < rounds.length; i++)
        {
            if(rounds[i] - prev > 0)
            {
                for(int j = prev; j < rounds[i]; j++)
                {
                    score[j-1]++;
                }
            }
            else
            {
                for(int j = prev; j < rounds[i]+n; j++)
                {
                    score[(j-1) % n]++;
                }
            }
            prev = rounds[i];
        }
        score[prev-1]++;
        int max = 0;
        for(int i : score)
        {  
            if(i > max)
            {
                max = i;
            }
        }
        for(int i = 0; i < n; i++)
        {
            if(score[i] == max)
            {
                answer.add(i+1);
            }
        }
        return answer;
        
    }
    
}