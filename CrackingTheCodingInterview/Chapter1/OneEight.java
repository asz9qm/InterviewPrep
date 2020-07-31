package CrackingTheCodingInterview.Chapter1;

// if a there is a 0 in a row or col, changes that whole row/col to 0 in place
public class OneEight 
{

    static int[][] zero(int[][] matrix)
    {
        boolean col = false;
        boolean row = false;
        for (int x : matrix[0])
        {
            if (x == 0)
            {
                row = true;
            }
        }
        for (int y = 0; y < matrix.length; y++)
        {
            if (y == 0)
            {
                col = true;
            }
        }
        for (int x = 1; x < matrix.length; x++)
        {
            for (int y = 1; y < matrix[0].length; y++)
            {
                if(matrix[x][y] == 0)
                {
                    matrix[x][0] = 0;
                    matrix[0][y] = 0;
                }
            }
        }
        for (int i = 1; i < matrix[0].length; i++)
        {
            if (matrix[0][i] == 0)
            {
                for (int y = 1; y < matrix.length; y++)
                {
                    matrix[y][i] = 0;
                }
            }
        }
        for (int i = 1; i < matrix.length; i++)
        {
            if (matrix[i][0] == 0)
            {
                for (int x = 1; x < matrix[0].length; x++)
                {
                    matrix[i][x] = 0;
                }
            }
        }
        if(row)
        {
            for (int i = 0; i < matrix[0].length; i++)
            {
                matrix[0][i] = 0;
            }
        }
        if(col)
        {
            for (int i = 0; i < matrix.length; i++)
            {
                matrix[i][0] = 0;
            }
        }
        return matrix;
    }
    
}