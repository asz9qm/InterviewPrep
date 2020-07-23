class node:
    next = None
    value = None

    def __init__(self, value=None):
        self.next = None
        self.value = value
    def update(self, value):
        self.value = value
    def __str__(self):
        return str(self.value)
    
class linkedlist:
    head = node()
    tail = node()
    count = 0

    def __init__(self):
        self.head = node()
        self.tail = node()
        self.head.next = self.tail
        self.count = 0
    # add only inserts at tail
    def add(self, value):
        a = node(value)
        pointer = self.head
        if (self.count == 0):
            self.head.next = a
            a.next = self.tail
        else:
            while (pointer.next != self.tail):
                pointer = pointer.next
            pointer.next = a
            a.next = self.tail
        self.count += 1
    def insert(self, string):
        for i in range(0, len(string)):
            self.add(string[i])
    def print(self):
        node = self.head
        while(node.next.value != None):
            node = node.next
            print(node)