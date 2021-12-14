class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.head = None

    def push(self, value):
        new_node = Node(value)
        new_node.next = self.head
        self.head = new_node
        return

    def pop(self):
        if self.is_empty():
            return "Stack is Empty"
        node = self.head
        self.head = self.head.next
        return node.data

    def peek(self):
        if self.is_empty():
            return "Stack is Empty"
        return self.head.data

    def is_empty(self):
        return self.head is None


stack = Stack()
stack.push(1)
stack.push(2)
stack.push(3)
print(stack.is_empty())
print(stack.peek())
print(stack.pop())
print(stack.pop())
print(stack.pop())
print(stack.pop())
print(stack.is_empty())