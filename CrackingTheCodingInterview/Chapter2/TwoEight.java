package CrackingTheCodingInterview.Chapter2;

// finds loop in linked list
public class TwoEight 
{
    LinkedListNode loop(LinkedListNode root)
    {
        LinkedListNode fast = root;
        LinkedListNode slow = root;
        while (fast != null && fast.getNext() != null)
        {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
            if (fast == slow)
            {
                break;
            }
        }

        if (fast == null || fast.getNext() == null)
        {
            return null;
        }

        fast = root;
        while (fast != slow)
        {
            fast = fast.getNext();
            slow = slow.getNext();
        }

        return fast;
    }

}