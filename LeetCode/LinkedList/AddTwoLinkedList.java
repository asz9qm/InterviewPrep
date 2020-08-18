// https://leetcode.com/problems/add-two-numbers/
package LeetCode.LinkedList;

public class AddTwoLinkedList 
{
    class ListNode 
    {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode root = new ListNode();
        int carry = 0;
        ListNode pointer = root;
        while(l1 != null || l2 != null)
        {
            if(l1 != null)
            {
                carry += l1.val;
                l1 = l1.next;
            }
            if(l2 != null)
            {
                carry += l2.val;
                l2 = l2.next;
            }
            ListNode temp = new ListNode();
            pointer.next = temp;
            pointer = pointer.next;
            if (carry > 9)
            {
                pointer.val = carry % 10;
                carry = 1;
            }
            else
            {
                pointer.val = carry;
                carry = 0;
            } 
            
            
        }
        if(carry == 1)
        {
            ListNode temp = new ListNode(1);
            pointer.next = temp;
        }
        return root.next;
        
        
    }
    
}