// one edit away
public class OneFive 
{

    public Boolean check(String one, String two)
    {
        if (one.length() == two.length()) 
        {
            return replace(one, two);
        }
        else if(one.length() == two.length()+1)
        {
            return single(one, two);
        }
        else if(one.length() == two.length()-1)
        {
            return single(two, one);
        }
        return false;
    }
    
    public Boolean replace(String one, String two)
    {
        int differences = 0;
        for (int i = 0; i < one.length(); i++)
        {
            if (one.charAt(i) != two.charAt(i))
            {
                differences++;
            }
        }
        if(differences <= 1)
        {
            return true;
        }
        return false;
    }

    public Boolean single(String one, String two)
    {
        int index1 = 0;
        int index2 = 0;
        while (index1 < one.length() && index2 < two.length())
        {
            if (one.charAt(index1) != two.charAt(index2))
            {
                index1++;
                if(index1 != index2)
                {
                    return false;
                }
            }
            else
            {
                index1++;
                index2++;
            }
        }
        return true;
    }
}