# two numbers are represented in a linked list with the ones digit comming first and the largest digit coming last
# add them together and return a linked list
class partial:
    next = node()
    carry = 0
    def __init__(self, node, carry=0):
        self.next = node
        self.carry = carry


def add(linkedlist1, linkedlist2):
    pointer1 = linkedlist1.head
    pointer2 = linkedlist2.head
    over = 0
    new_list = linkedlist()
    while(pointer1 != linkedlist1.tail or pointer2 != linkedlist2.tail):
        sum = 0
        if(pointer1.next != linkedlist2.tail):
            pointer1 = pointer1.next
            sum += pointer1.value
        if(pointer2.next != linkedlist2.tail):
            pointer2 = pointer2.tail
            sum += pointer2.value
        sum += over
        new_list.add(sum % 10)
        over = 0
        if(sum > 9):
            over = 1
    return new_list

# what happens if the lists were stored from largest to smallest digit
# return the root of a linked list, does not include head/tail
def add_2(linkedlist1, linkedlist2):
    length1 = length(linkedlist1)
    length2 = length(linkedlist2)
    if(length1 > length2):
        for i in range(length1-length2):
            add_at_head(linkedlist2, 0)
    if(length2 > length1):
        for i in range(length2-length1):
            add_at_head(linkedlist1, 0)
    temp = add_help(linked1.head.next, linkedlist2.head.next)
    if(temp.carry > 0):
        head=node(temp.carry)
        head.next = temp.next
    else:
        return temp.next
    

def add_helper(node1, node2):
    if(node1.next.value == None):
        p = partial_generator(node1.value, node2.value, 0)
        return p
    p = add_helper(node1.next, node2.next)
    p2 = partial_generator(node1.value, node2.value, p.carry)
    p2.next.next = p.next
    return p2

def partial_generator(value1, value2, carry):
    temp = value1 + value2 + carry
    n = node()
    p = partial(n)
    if (temp > 9):
        n.value = temp % 10
        p.carry = 1
    else:
        n.value = temp
    return p

def length(linkedlist):
    pointer = linkedlist.head.next
    count = 0
    while(pointer != linkedlist.tail):
        count += 1
        pointer = pointer.next
    return count

def add_at_head(linkedlist, value):
    a = node(value)
    a.next = linkedlist.head.next
    linkedlist.head.next = a


        
        
        
        
