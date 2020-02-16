class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.before = None


class CicularDoubleLinkedList:

    def __init__(self):
        self.current = None
        self.head = None
        self.tail = None
        self.size = 0
        pass

    def append(self, data):
        new_node = Node(data)
        if self.size == 0:
            self.current = self.head = self.tail = new_node
            new_node.next = new_node.prev = new_node
            self.size += 1
        else:
            self.tail.next = new_node
            new_node.next = self.head
            new_node.prev = self.tail
            self.tail = new_node
            self.size += 1

    def pop(self, index):
        self.move(index)
        node = self.current
        if node == self.head:
            self.head = self.current = node.next
            self.tail.next = self.head
        elif node == self.tail:
            self.tail = node.prev
            self.tail.next = self.current = self.head
        else:
            node.next.prev = node.prev
            node.prev.next = node.next
            self.current = node.next
        self.size -= 1

        return node

    def move(self, index):
        node = self.current
        for _ in range(index):
            node = node.next

        self.current = node


n, k = map(int, input().split())
cdl = CicularDoubleLinkedList()
for i in range(n):
    cdl.append(i+1)
result = []
while cdl.size != 0:
    result.append(str(cdl.pop(k-1).data))
print("<" + ", ".join(result) + ">")
