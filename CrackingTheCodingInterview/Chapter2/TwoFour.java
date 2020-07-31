// partion a linked list using a value, all elements less than will be on the left while elements equal to or larger will be on the right
// the element just needs to be on the right side
import java.util.*;

public class TwoFour {

    LinkedList<Integer> partion(LinkedList<Integer> ll, int value)
    {
        LinkedList<Integer> new_list = new LinkedList<Integer>();
        for (Integer c: ll)
        {
            if (c < value)
            {
                new_list.addFirst(c);
            }
            else
            {
                new_list.addLast(c);
            }

        }
        return new_list;
    } 
    
}