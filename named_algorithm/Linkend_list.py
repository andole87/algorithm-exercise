class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.before = None

class CircularDoubleLinkedList:

    def __init__(self):
        self.current = None
        self.head = None
        self.tail = None
        self.size = 0
        pass
    
    def append(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = self.tail = new_node
            new_node.next = self.head
            self.size += 1
        else:
            self.tail.next = new_node
            self.tail = new_node
            self.tail.next = self.head
            self.size += 1

    def pop(self, index):
        node = self.head
        for _ in range(index):
            node = node.next

        node.prev.next = node.next
        node.next.prev = node.prev

        if node == self.head:
            self.head = node.next
        elif node == self.tail:
            self.tail = node.prev
        self.size -= 1

        return node
