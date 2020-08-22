package LeetCode.Contests.BiweeklyContest33;

public class CycleDetect 
{
    int[] X = {1, -1, 0, 0};
    int[] Y = {0, 0, 1, -1};

    private boolean dfs(int curX, int curY, int lastX, int lasty, int n, int m, boolean[][] vis, char[][] grid, char startChar) 
    {
        vis[curX][curY] = true;
        boolean hasCycle = false;
        // Visit all directions
        for (int i = 0; i < 4; ++i) 
        {
            int new_x = curX + X[i];
            int new_y = curY + Y[i];
            // Valid point?
            if (new_x >= 0 && new_x < n && new_y >= 0 && new_y < m) 
            {
                // Don't visit last visited point
                if (!(new_x == lastX && new_y == lasty)) 
                {
                    // Only visit nodes that equal start character
                    if (grid[new_x][new_y] == startChar) 
                    {
                        if (vis[new_x][new_y]) 
                        {
                            return true;
                        } else 
                        {
                            hasCycle |= dfs(new_x, new_y, curX, curY, n, m, vis, grid, startChar);
                        }
                    }
                }
            }
        }
        return hasCycle;
    }

    public boolean containsCycle(char[][] grid) 
    {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        boolean ans = false;
        for (int i = 0; i < grid.length; ++i) 
        {
            for (int j = 0; j < grid[i].length; ++j) 
            {
                if (!vis[i][j]) 
                {
                    ans |= dfs(i, j, -1, -1, n, m, vis, grid, grid[i][j]);
                }
            }
        }
        return ans;
    }
    
}