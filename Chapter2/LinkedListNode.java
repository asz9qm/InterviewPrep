public class LinkedListNode 
{

    private int value;
    private LinkedListNode next;

    public LinkedListNode()
    {
        this.value = 0;
        this.next = null;
    }

    public LinkedListNode(int change)
    {
        this.value = change;
    }

    public void setNext(LinkedListNode next)
    {
        this.next = next;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public LinkedListNode getNext()
    {
        return this.next;
    }

    public int getValue()
    {
        return this.value;
    }
    
}