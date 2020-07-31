package CrackingTheCodingInterview.Chapter2;

import java.util.*;

public class TwoOne
{

    void remove_duplicates(MyLinkedList n)
    {
        HashSet<Integer> set = new HashSet<Integer>();
        LinkedListNode current = n.getHead().getNext();
        LinkedListNode previous = n.getHead();
        while (current != n.tail)
        {
            if(!set.contains(current.getValue()))
            {
                set.add(current.getValue());
                previous = previous.getNext();
            }
            else
            {
                previous.setNext(current.getNext());
            }
            current = current.getNext();
                
        }

    }   
}