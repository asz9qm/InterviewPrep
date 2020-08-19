package LeetCode.DynamicProgramming;

public class UpdateMatrix 
{
    public int[][] updateMatrix(int[][] matrix) 
    {
        int rows = matrix.length;
        if(rows == 0)
        {
            return matrix;
        }
        int cols = matrix[0].length;
        int[][] results = new int[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(matrix[i][j] != 0)
                {
                    results[i][j] = 2001;
                }
                    
            }
        }
        
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(i > 0)
                {
                    results[i][j] = Math.min(results[i][j], results[i - 1][j] + 1);
                }
                if(j > 0)
                {
                    results[i][j] = Math.min(results[i][j], results[i][j - 1] + 1);
                }
            }
        }
        
        for(int i = rows - 1; i >= 0; i--)
        {
            for(int j = cols - 1; j >= 0; j--)
            {
                if(i < rows -1)
                {
                    results[i][j] = Math.min(results[i][j], results[i + 1][j] + 1);
                }
                if(j < cols -1)
                {
                    results[i][j] = Math.min(results[i][j], results[i][j+1] + 1);
                }
            }
        }
        
        return results;
        
    }
    
}