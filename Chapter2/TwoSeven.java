// checks if there is an intersection within a linked list
// assumes that the linked lists don't diverge after the intersection
public class TwoSeven {

    LinkedListNode intersection(LinkedListNode a, LinkedListNode b)
    {
        int aLength = 1;
        int bLength = 1;
        LinkedListNode aPointer = a;
        LinkedListNode bPointer = b;
        while(aPointer.getNext() != null)
        {
            aLength++;
            aPointer = aPointer.getNext();
        }
        while(bPointer.getNext() != null)
        {
            bLength++;
            bPointer = bPointer.getNext();
        }
        if(aPointer != bPointer)
        {
            return null;
        }
        if(aLength > bLength)
        {
            for(int i = 0; i < aLength-bLength; i++)
            {
                a = a.getNext();
            }
        }
        if(bLength > aLength)
        {
            for(int i = 0; i < bLength-aLength; i++)
            {
                b = b.getNext();
            }
        }
        while(a != b)
        {
            a = a.getNext();
            b = b.getNext();
        }

        return a;
    }


    
}