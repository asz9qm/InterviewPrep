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
        self.count = 0
    def add(self, value):
        a = node(value)
        if (self.count == 0):
            self.head.next = a
            self.tail = a
        else:
            self.tail.next = a
            self.tail = a
        self.count += 1
    def print(self):
        node = self.head
        while(node.next != None):
            node = node.next
            print(node)
