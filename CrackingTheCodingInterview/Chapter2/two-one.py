# remove duplicates from unsorted linked list

# Takes in a linked list
def remove_deplicates(linked_list):
    s = set()
    node = linked_list.head.next
    node2 = linked_list.head
    while(node != linked_list.tail):
        if(node.value not in s):
            s.add(node.value)
            node = node.next
            node2 = node2.next
        else:
            node2.next = node.next
            node = node.next
            linked_list.count -= 1
        

# if it has to be in place removal
def remove_deplicates_in_place(linked_list):
    node = linked_list.head.next
    

    while(node != linked_list.tail):
        node2 = node.next
        node3 = node
        while(node2 != linked_list.tail):
            if (node2.value == node.value):
                node2 = node2.next
                node3.next = node2
            else:
                node2 = node2.next
                node3 = node3.next
                linked_list.count -= 1
        node = node.next
