package LeetCode.Contests.WeeklyContest202;

public class ThreeOdds 
{
    public boolean threeConsecutiveOdds(int[] arr) 
    {
        int count = 0;
        for(Integer i : arr)
        {
            if(i % 2 == 1)
            {
                count++;
                if(count == 3)
                {
                    return true;
                }
                
            }
            else
            {
                count = 0;
            }
        }
        return false;
        
    }
    
}