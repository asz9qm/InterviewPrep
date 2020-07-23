# returns the kth to last element in a linked list

#assume last element is k = 1
def kth_to_last(linkedlist, k):
    first = linkedlist.head
    second = linkedlist.head
    for i in range(1, k):
        first = first.next
    while (first.next != tail):
        first = first.next
        second = second.next
    return second
