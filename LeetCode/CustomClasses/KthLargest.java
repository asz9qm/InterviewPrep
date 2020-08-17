// https://leetcode.com/problems/kth-largest-element-in-a-stream/
package LeetCode.CustomClasses;

import java.util.PriorityQueue;

public class KthLargest 
{
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int k;

    public KthLargest(int k, int[] nums)
    {
        this.k = k;
        for(int i : nums)
        {
            addHelper(i);
        }
    }

    public int add(int val) 
    {
        addHelper(val);
        return this.pq.peek();
        
    }
    
    private void addHelper(int val)
    {
        if(this.pq.size() < this.k)
        {
            this.pq.offer(val);
        }
        else if(val > this.pq.peek())
        {
            this.pq.poll();
            this.pq.offer(val);
        }
    }
    
}