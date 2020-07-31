# checks if two linked lists intersect based on reference, assumes that they will not diverge after the intersection
# takes in two nodes that are the roots of their linked lists
def intersection(n1, n2):
    pointer1 = n1
    pointer2 = n2
    length1 = 1
    length2 = 1
    while(pointer1.next != None):
        length1 += 1
        pointer1 = pointer1.next
    while(pointer2.next != None):
        length2 += 1
        pointer2 = pointer2.next
    if (pointer1 != pointer2):
        return False
    if(length1 > length2):
        for i in range(length1 - length2):
            n2 = n2.next
    if(length2 > length1):
        for i in range(length2 - length1):
            n1 = n1.next
    while(n1 != n2):
        n1 = n1.next
        n2 = n2.next
    return n1