// https://leetcode.com/problems/pacific-atlantic-water-flow/
package LeetCode.Graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WaterFlow 
{
    public List<List<Integer>> pacificAtlantic(int[][] matrix) 
    {
        List<List<Integer>> res = new LinkedList<>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
        {
            return res;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        boolean[][] atlantic = new boolean[m][n];
        boolean[][] pacific = new boolean[m][n];

        Queue<int[]> pq = new LinkedList<>();
        Queue<int[]> aq = new LinkedList<>();        

        for(int i = 0; i < m; i++)
        {
            pq.offer(new int[]{i, 0});
            pacific[i][0] = true;
            aq.offer(new int[]{i, n-1});
            atlantic[i][n-1] = true;
        }

        for(int i = 1; i < n; i++)
        {
            pq.offer(new int[]{0, i});
            pacific[0][i] = true;
            aq.offer(new int[]{m-1, n-i-1});
            atlantic[m-1][n-i-1] = true;
        }

        bfs(matrix, pq, pacific);
        bfs(matrix, aq, atlantic);

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(pacific[i][j] && atlantic[i][j])
                {
                    LinkedList<Integer> a = new LinkedList<>();
                    a.add(i);
                    a.add(j);
                    res.add(a);
                }
            }
        }
        return res;
        
    }

    public void bfs(int[][] matrix, Queue<int[]> q, boolean[][] visited)
    {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dir = new int[][]{{1,0}, {-1,0}, {0,1}, {0,-1}};
        while(!q.isEmpty())
        {
            int[] co = q.poll();
            for(int[] d: dir)
            {
                int x = co[0] + d[0];
                int y = co[1] + d[1];
                if(x >= m || y >= n || x < 0 || y <0 || visited[x][y] || matrix[x][y] < matrix[co[0]][co[1]])
                {
                    continue;
                }
                visited[x][y] = true;
                q.offer(new int[]{x,y});
            }
        }

    }
    
}