class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self, value):
        self.head = Node(value)

    def append(self, value):
        cur = self.head
        while cur.next is not None:
            cur = cur.next
        cur.next = Node(value)

    def get_kth_node_from_last(self, k):
        pin = self.head
        node = self.head

        count = 1
        while count < k:
            pin = pin.next
            count += 1

        while pin.next is not None:
            pin = pin.next
            node = node.next
        return node


linked_list = LinkedList(1)
linked_list.append(2)
linked_list.append(3)
linked_list.append(4)
linked_list.append(5)
linked_list.append(6)
linked_list.append(7)

print(linked_list.get_kth_node_from_last(1).data)  # 7이 나와야 합니다!