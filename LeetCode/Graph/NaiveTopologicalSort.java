package LeetCode.Graph;

import java.util.*;

public class NaiveTopologicalSort 
{
/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 
 {0, 1} 0 depends on 1
 */
  public static void main(String[] args) 
  {
    String[][] dependencies = {{"milk", "cereal"}, {"cereal", "milk"}, {"orange juice", "cereal"}, {"cookies", "orange juice"}};
    HashMap<String, Integer> map = new HashMap<>();
    HashSet<String> set = new HashSet<>();
    Queue<String> q = new LinkedList<>();
    for(String[] s : dependencies)
    {
       if(!map.containsKey(s[0]))
        {
            map.put(s[0], 1); 
        }
      else
      {
          map.put(s[0], map.get(s[0])+1);
      }
      set.add(s[0]);
      set.add(s[1]);
    }
    
    int count = 0;
    for(String s : set)
    {
      if(!map.containsKey(s))
      {
        q.add(s);
        System.out.println(s);
        count++;
      }
    }
    
    while(!q.isEmpty())
    {
      String current = q.poll();
      for(String[] pair : dependencies)
      {
        if(current.equals(pair[1]))
        {
          int value = map.get(pair[0]);
          value--;
          if(value == 0)
          {
            q.add(pair[0]);
            System.out.println(pair[0]);
            count++;
          }
          map.put(pair[0], value);
        }
        
      }
      
    }
    
    if(count != set.size())
    {

       System.out.println("not possible");
    }
    
    

      
    
  }
}
