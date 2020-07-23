// returns the kth to last element
public class TwoTwo {

    static LinkedListNode kth(MyLinkedList ll, int k)
    {
        LinkedListNode current = ll.getHead();
        LinkedListNode previous = ll.getHead();
        for (int i = 1; i < k; i++)
        {
            current = current.getNext();
        }
        while (current != ll.getTail())
        {
            current = current.getNext();
            previous = previous.getNext();
        }
        return previous;
    }
    
}