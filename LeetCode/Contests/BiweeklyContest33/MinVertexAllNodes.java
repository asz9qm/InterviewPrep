package LeetCode.Contests.BiweeklyContest33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MinVertexAllNodes 
{
    class UF
    {
        public int[] parent;
        public HashSet<Integer> ha;
        
        public UF(int n)
        {
            parent = new int[n];
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
            int nParent = find(n);
            parent[m] = nParent;
        }
        
        public void ending()
        {
            this.ha = new HashSet<>();
            for(int i : this.parent)
            {
                int parent = find(i);
                if(!ha.contains(parent))
                {
                    this.ha.add(parent);
                }
            }
        }
        
        public List<Integer> end()
        {
            this.ending();
            List<Integer> list = new ArrayList<Integer>(this.ha);
            return list;
        }

        
    }
    
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) 
    {
        UF set = new UF(n);
        for(int i = 0; i < edges.size(); i++)
        {
            int first = edges.get(i).get(0);
            int second = edges.get(i).get(1);
            set.union(first, second);
        }
        return set.end();        
        
    }
    
}