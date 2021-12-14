class MaxHeap:
    def __init__(self):
        self.items = [None]

    def insert(self, value):
        self.items.append(value)
        index = len(self.items)-1

        while index > 1:
            if value > self.items[index//2]:
                self.items[index], self.items[index // 2] = self.items[index // 2], self.items[index]
                index = index // 2
            else:
                break
        return

    def delete(self):
        self.items[1], self.items[-1] = self.items[-1], self.items[1]
        delete_node = self.items.pop()

        index = 1
        while index*2+1 < len(self.items):
            if self.items[index*2] > self.items[index*2+1]:
                if self.items[index] > self.items[index*2]:
                    break
                else:
                    self.items[index], self.items[index*2] = self.items[index*2], self.items[index]
                    index = index*2
            else:
                if self.items[index] > self.items[index*2+1]:
                    break
                else:
                    self.items[index], self.items[index*2+1] = self.items[index*2+1], self.items[index]
                    index = index*2+1
        return delete_node  # 8 을 반환해야 합니다.

max_heap = MaxHeap()
max_heap.insert(8)
max_heap.insert(6)
max_heap.insert(7)
max_heap.insert(2)
max_heap.insert(5)
max_heap.insert(4)
print(max_heap.items)  # [None, 8, 6, 7, 2, 5, 4]
print(max_heap.delete())  # 8 을 반환해야 합니다!
print(max_heap.items)  # [None, 7, 6, 4, 2, 5]