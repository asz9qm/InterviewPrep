package LeetCode.Contests.WeeklyContest203;

public class CountLengthOfGroups 
{
    public int findLatestStep(int[] A, int m) 
    {
        int res = -1;
        int n = A.length;
        if (n == m) 
        {
            return n;
        }
        int[] length = new int[n + 2];
        for (int i = 0; i < n; ++i) 
        {
            int a = A[i];
            int left = length[a - 1];
            int right = length[a + 1];
            length[a - left] = length[a + right] = left + right + 1;
            if (left == m || right == m)
            {
                res = i;
            }
               
        }
        return res;
    }

    
}