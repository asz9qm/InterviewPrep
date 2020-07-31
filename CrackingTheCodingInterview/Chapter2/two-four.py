# partions a linked list given a value to partion around, the value only needs to be on the right side of the partion
# going to use deque for this question

from collections import deque

def partion(ll, value):
    new_list = deque()
    for item in ll:
        if item < value:
            new_list.appendleft(item)
        else:
            new_list.append(item)
    