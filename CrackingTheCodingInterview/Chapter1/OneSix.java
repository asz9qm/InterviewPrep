package CrackingTheCodingInterview.Chapter1;

// String compression
public class OneSix {

    public static void main(String[] args)
    {

    }

    static String join(String str)
    {
        int length = checkLength(str);
        if (str.length() <= length)
        {
            return str;
        }
        return compress(str, length);
    }

    static int checkLength(String str)
    {
        int length = 1;
        for (int i = 0; i < str.length()-1; i++)
        {
            if (str.charAt(i) != str.charAt(i+1))
            {
                length++;
            }
        }
        return length;
    }

    static String compress(String str, int length)
    {
        StringBuilder array = new StringBuilder(length);
        // String[] array = new String[length];
        int count = 1;
        for (int i = 0; i < str.length(); i++)
        {
            if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1))
            {
                array.append(str.substring(i, i+1));
                array.append(count);
                count = 1;
            }
            else
            {
                count++;
            }
        }
        return array.toString();
    }
    
}