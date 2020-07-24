// If numbers were stored as linked lists and each node was a digit, how to add two linked list together if ones digit is first
// and largest digit is last
public class TwoFive {

    // if the linked list had smallest first
    LinkedListNode add(LinkedListNode a, LinkedListNode b)
    {
        int carry = 0;
        LinkedListNode root = new LinkedListNode();
        LinkedListNode pointer = root;

        while(a.getNext() != null || b.getNext() != null)
        {
            if(a != null)
            {
                carry += a.getValue();
            }
            if(b != null)
            {
                carry += b.getValue();
            }

            LinkedListNode current = new LinkedListNode();
            pointer.setNext(current);
            pointer = pointer.getNext();
            if (carry > 9)
            {
                current.setValue(carry % 10);
                carry = 1;
            }
            else
            {
                current.setValue(carry);
                carry = 0;
            }       


        }

        return root;
    }
    
}