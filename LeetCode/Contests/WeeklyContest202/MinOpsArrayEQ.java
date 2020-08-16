package LeetCode.Contests.WeeklyContest202;

public class MinOpsArrayEQ 
{
    public int minOperations(int n) 
    {
        if(n <= 1)
        {
            return 0;
        }
        int sum = 0;
        for(int i = 1; i <= n / 2; i++)
        {
            int lower = (2*i) - 1;
            int higher = (n-i) * 2 + 1;
            sum += (higher - lower) / 2;
        }
        return sum;
        
    }
    
}