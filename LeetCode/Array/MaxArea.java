// https://leetcode.com/problems/container-with-most-water/submissions/
package LeetCode.Array;

public class MaxArea 
{

    public int maxArea(int[] height) 
    {
        int lower = 0;
        int higher = height.length - 1;
        int answer = 0;

        while(lower < higher)
        {
            answer = Math.max(answer, Math.min(height[lower], height[higher]) * (higher - lower));
            if(height[lower] < height[higher])
            {
                lower++;
            }
            else
            {
                higher--;
            }
            
        }

        return answer;
        
    }
    
}