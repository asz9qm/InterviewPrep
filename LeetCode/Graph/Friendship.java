// https://leetcode.com/problems/friend-circles/
package LeetCode.Graph;

public class Friendship 
{
    class UF
    {
        private int n = 0;
        private int[] parent, rank;
        
        public UF(int n)
        {
            this.n = n;
            parent = new int[n];
            rank = new int[n];
            for(int i = 0; i < n; i++)
            {
                parent[i] = i;
            }        
        }

        public int find(int n)
        {
            while(parent[n] != n)
            {
                parent[n] = parent[parent[n]];
                n = parent[n];
            }
            return n;
        }

        public void union(int n, int m)
        {
            int nRoot = find(n);
            int mRoot = find(m);
            if(nRoot == mRoot)
            {
                return;
            }
            if(rank[nRoot] > rank[mRoot])
            {
                parent[mRoot] = nRoot;
            }
            else
            {
                parent[nRoot] = mRoot;
                if (rank[nRoot] == rank[mRoot]) 
                {
                    rank[mRoot]++;
                }
            }
            this.n--;
        }

        public int count()
        {
            return this.n;
        }
        
    }  
    
    
    
    public int findCircleNum(int[][] M) 
    {
        int n = M.length;
        UF uf = new UF(n);
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (M[i][j] == 1) 
                {
                    uf.union(i, j);
                }
            }
        }
        return uf.count();
        
    }
    
}