// find number of ones in a binary number
package LeetCode.Binary;

public class Ones
{
    public int hammingWeight(int n) 
    {
        int total = 0;
        while (n != 0) 
        {
            total++;
            n &= (n - 1);
        }
        return total;
        
    }
}