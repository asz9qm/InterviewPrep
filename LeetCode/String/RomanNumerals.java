// https://leetcode.com/problems/roman-to-integer/
package LeetCode.String;

public class RomanNumerals 
{
    public int romanToInt(String s) 
    {
        int sum = 0;
        int previous = 0;
        for(int i = s.length()-1; i >= 0; i--)
        {
            int value = singleToInt(s.charAt(i));
            if(value < previous)
            {
                sum -= value;
            }
            else
            {
                sum += value;
            }
            previous = value;
        }
        return sum;
    }
    
    public int singleToInt(char c)
    {
        switch(c)
        {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default: return -1;
        }
    }
    
}