// https://leetcode.com/problems/student-attendance-record-i/
package LeetCode.String;

public class StudentAttedance 
{
    public boolean checkRecord(String s) 
    {
        boolean absent = false;
        int late = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char temp = s.charAt(i);
            if(temp != 'P')
            {
                if(temp == 'A')
                {
                    late = 0;
                    if(absent)
                    {
                        return false;
                    }
                    else
                    {
                        absent = true;
                    }
                }
                if(temp == 'L')
                {
                    if(late >= 2)
                    {
                        return false;
                    }
                    else
                    {
                        late++;
                    }
                }
                
            }
            else
            {
                late = 0;
            }

        }
        return true;
        
    }
    
}