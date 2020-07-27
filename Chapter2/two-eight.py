# find a loop in a linked list

# passes in the root node
def loop(root):
    fast = root
    slow = root
    
    while(fast.next != None and fast != None):
        fast = fast.next.next
        slow = slow.next
        if (slow == fast):
            break
    
    if(fast == None or fast.next == None):
        return None

    fast = root
    while(slow != fast):
        slow = slow.next
        fast = fast.next
    return slow

        
