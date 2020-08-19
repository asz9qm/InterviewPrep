package LeetCode.String;

import java.util.HashSet;

public class WordPatterns 
{
    public boolean wordPattern(String pattern, String str) 
    {
        String[] arr = new String[26];    
        String[] arr2 = str.split(" ");
        HashSet<String> set = new HashSet<>();
        if(arr2.length != pattern.length())
        {
            return false;
        }
        // a = 97
        for(int i = 0; i < arr2.length; i++)
        {
            int temp = pattern.charAt(i) - 97;
            if(arr[temp] == null)
            {
                if(set.contains(arr2[i]))
                {
                    return false;
                }
                set.add(arr2[i]);
                arr[temp] = arr2[i];
            }
            else
            {
                if(!arr[temp].equals(arr2[i]))
                {
                    return false;
                }
            }
        }
        return true;
    }
    
}