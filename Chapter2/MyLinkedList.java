public class MyLinkedList {

    LinkedListNode head;
    LinkedListNode tail;
    int count;

    public MyLinkedList()
    {
        this.head = new LinkedListNode();
        this.tail = new LinkedListNode();
        this.head.setNext(tail); 
        this.count = 0;
    }

    public void add(int value)
    {
        LinkedListNode temp = new LinkedListNode(value);
        if(this.count == 0)
        {            
            temp.setNext(this.tail);
            this.head.setNext(temp);
        }
        else
        {
            LinkedListNode pointer = head;
            while(pointer.getNext() != this.tail)
            {
                pointer = pointer.getNext();
            }
            pointer.setNext(temp);
            temp.setNext(this.tail);
        }
        this.count++;

    }

    public LinkedListNode getHead() 
    {
		return this.head;
    }
    
    public LinkedListNode getTail() 
    {
		return this.tail;
	}
    
}