// deletes a node given only the data from that node in a singly linked list
public class TwoThree {

    boolean deleteNode(LinkedListNode a)
    {
        if (a == null || a.getNext()==null)
        {
            return false;
        }
        a.setNext(a.getNext().getNext());
        a.setValue(a.getNext().getValue());
        return true;
    }
    
}