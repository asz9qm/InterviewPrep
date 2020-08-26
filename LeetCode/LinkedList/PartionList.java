package LeetCode.LinkedList;

public class PartionList 
{
    public class ListNode 
    {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode partition(ListNode head, int x) 
    {
        ListNode lowerHead = new ListNode(0);
        ListNode upperHead = new ListNode(0);
        ListNode lower = lowerHead;
        ListNode upper = upperHead;
        while(head != null)
        {
            if(head.val < x)
            {
                lower.next = head;
                lower = lower.next;
            }
            else
            {
                upper.next = head;
                upper = upper.next;
            }
            head = head.next;
        }
        upper.next = null;
        lower.next = upperHead.next;
        return lowerHead.next;
        
    }
    
}