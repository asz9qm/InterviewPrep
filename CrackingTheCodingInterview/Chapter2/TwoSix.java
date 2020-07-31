// checks if a linked list is a palindrome
public class TwoSix {

    Boolean check(LinkedListNode root)
    {
        LinkedListNode two = new LinkedListNode(root.getValue());
        LinkedListNode pointer = root;
        int count = 1;
        while(pointer.getNext() != null)
        {
            pointer = pointer.getNext();
            LinkedListNode temp = new LinkedListNode(pointer.getValue());
            temp.setNext(two);
            two = temp;
            count++;
        }
        for (int i = 0; i < count / 2; i++)
        {
            if(root.getValue() != two.getValue())
            {
                return false;
            }
        }
        return true;
    }
    
}