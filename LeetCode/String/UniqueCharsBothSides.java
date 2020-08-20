package LeetCode.String;

public class UniqueCharsBothSides 
{
    /**
     * Returns number of splits in which both sides have
     * same number of unique characters
     * @param s the string to split, made of letters a-z
     * @return the count of the splits
     */
    public int unique(String s)
    {
        if(s.length() < 2)
        {
            return 0;
        }

        int[] left = new int[26];
        int[] right = new int[26];

        for(char c : s.toCharArray())
        {
            right[c-'a']++;
        }

        int count = 0;
        for(char c : s.toCharArray())
        {
            left[c-'a']++;
            right[c-'a']--;
            if(compare(left, right))
            {
                count++;
            }

        }
        return count;
        

    }

    private boolean compare(int[] l, int[] r)
    {
        for(int i = 0; i < l.length; i++)
        {
            if(l[i] > 0 && r[i] > 0)
            {
                continue;
            }
            else if(l[i] == 0 && r[i] == 0)
            {
                continue;
            }
            else 
            {
                return false;
            }
        }
        return true;
    }
    
}