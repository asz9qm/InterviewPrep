package LeetCode.DynamicProgramming;

public class LongestComSubSeq 
{
    public int longestCommonSubsequence(String text1, String text2) 
    {
        int m = text1.length(); //longer
        int n = text2.length(); //shorter
        if (m < n) 
        {
            return longestCommonSubsequence(text2, text1);
        }
        int[] dp = new int[n + 1]; //shorter
        for (int i = 0; i < text1.length(); ++i)  //longer
        {
            for (int j = 0, prevRow = 0, prevRowPrevCol = 0; j < text2.length(); ++j) //shorter
            {
                prevRowPrevCol = prevRow; //gets the previous corner
                prevRow = dp[j + 1]; //gets the current row above
                if ( text1.charAt(i) == text2.charAt(j))
                {
                    dp[j + 1] = prevRowPrevCol + 1;
                }
                else
                {
                    dp[j + 1] = Math.max(dp[j], prevRow);
                }
            }
        }
        return dp[n];
    }
    
}