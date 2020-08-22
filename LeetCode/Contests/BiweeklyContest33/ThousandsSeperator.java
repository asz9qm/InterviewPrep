package LeetCode.Contests.BiweeklyContest33;

public class ThousandsSeperator 
{

    public String thousandSeparator(int n) 
    {
        StringBuilder s = new StringBuilder();
        while(n > 999)
        {
            int temp = n % 1000;
            s.insert(0, n % 1000);
            if(temp < 100)
            {
                s.insert(0, 0);
                if(temp < 10)
                {
                    s.insert(0,0);
                }
            }
            
            s.insert(0, ".");
            n /= 1000;
            
        }
        s.insert(0, n);
        return s.toString();
        
    }
}


