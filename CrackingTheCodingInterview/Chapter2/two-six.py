# checks if a linked list is a palindrome given the root node
def check(root):
    ll2 = node(root.value)
    pointer = root
    count = 1
    while(root.next != None):
        pointer = pointer.next
        temp = node(pointer.value)
        temp.next = ll2
        ll2 = temp
        count += 1
    for i in range(count//2):
        if(ll2.value != root.value):
            return False
    return True
    

