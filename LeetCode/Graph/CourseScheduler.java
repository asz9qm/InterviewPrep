// https://leetcode.com/problems/course-schedule/

package LeetCode.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class CourseScheduler 
{
    public boolean canFinish(int numCourses, int[][] prerequisites) 
    {
        Queue<Integer> q = new LinkedList<>();
        if(numCourses == 0)
        {
            return true;
        }

        int[] indegree = new int[numCourses];

        for(int i = 0; i < prerequisites.length; i++)
        {
            indegree[prerequisites[i][0]]++;
        }

        for(int i = 0; i < indegree.length; i++)
        {
            if(indegree[i] == 0)
            {
                q.offer(i);
            }
        }

        while(!q.isEmpty())
        {
            int current = q.poll();
            for(int i = 0; i < prerequisites.length; i++)
            {
                if(current == prerequisites[i][1])
                {
                    indegree[prerequisites[i][0]]--;
                    if(indegree[prerequisites[i][0]] == 0)
                    {
                        q.offer(prerequisites[i][0]);
                    }
                }
            }
        }
        for(int i : indegree)
        {
            if(i != 0)
            {
                return false;
            }

        }
        return true;        
    }
    
}