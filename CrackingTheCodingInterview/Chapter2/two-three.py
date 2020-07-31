# delete a node that is not the first node or the last node if you're only given access to that node

# copies over the information and then removes the next node
# is not possible if it's the last node
def delete_node(node):
    if (node == None or node.next == None):
        quit
    node.next = node.next.next
    node.value = node.next.value
