package LeetCode.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class NetworkDelayTime 
{
    public int networkDelayTime(int[][] times, int N, int K) 
    {
        HashMap<Integer, List<int[]>> graph = new HashMap<>();
        for(int[] edge : times)
        {
            if(!graph.containsKey(edge[0]))
            {
                graph.put(edge[0], new ArrayList<int[]>());
            }
            graph.get(edge[0]).add(new int[]{edge[1], edge[2]});            

        }
        
        PriorityQueue<int[]> heap = new PriorityQueue<int[]>(
                (edge1, edge2) -> edge1[1] - edge2[1]);
        heap.add(new int[]{K, 0});
        
        HashMap<Integer, Integer> distance = new HashMap<>();
        
        while(!heap.isEmpty())
        {
            int[] edge = heap.poll();
            if(distance.containsKey(edge[0]))
            {
                continue;
            }
            distance.put(edge[0], edge[1]);
            if(graph.containsKey(edge[0]))
            {
                for(int[] path : graph.get(edge[0]))
                {
                    if(!distance.containsKey(path[0]))
                    {
                        heap.add(new int[]{path[0], edge[1]+path[1]});
                    }
                }
            }
        }
        
        if(distance.size() != N)
        {
            return -1;
        }
        int time = 0;
        for(int distances : distance.values())
        {
            time = Math.max(time, distances);
        }
        return time;
        
        
    }
    
}