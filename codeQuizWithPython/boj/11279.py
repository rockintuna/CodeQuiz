# 널리 잘 알려진 자료구조 중 최대 힙이 있다. 최대 힙을 이용하여 다음과 같은 연산을 지원하는 프로그램을 작성하시오.
# 배열에 자연수 x를 넣는다.
# 배열에서 가장 큰 값을 출력하고, 그 값을 배열에서 제거한다.
# 프로그램은 처음에 비어있는 배열에서 시작하게 된다.
#
# 첫째 줄에 연산의 개수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 N개의 줄에는 연산에 대한 정보를 나타내는 정수 x가 주어진다.
# 만약 x가 자연수라면 배열에 x라는 값을 넣는(추가하는) 연산이고, x가 0이라면 배열에서 가장 큰 값을 출력하고 그 값을 배열에서 제거하는 경우이다.
# 입력되는 자연수는 2^31보다 작다.
#
# 입력에서 0이 주어진 회수만큼 답을 출력한다. 만약 배열이 비어 있는 경우인데 가장 큰 값을 출력하라고 한 경우에는 0을 출력하면 된다.

import sys

class MaxHeap:
    def __init__(self):
        self.heap = [None]

    def insert(self, value):
        self.heap.append(value)
        index = len(self.heap)-1

        while index > 1:
            if self.heap[index] > self.heap[index//2]:
                self.heap[index], self.heap[index//2] = self.heap[index//2], self.heap[index]
                index = index//2
            else:
                break

    def delete(self):
        if len(self.heap) == 1:
            return 0

        self.heap[1], self.heap[-1] = self.heap[-1], self.heap[1]
        top = self.heap.pop()

        index = 1
        while index < len(self.heap):
            left_child_node_index = index*2
            right_child_node_index = index*2+1
            max_index = index

            if left_child_node_index < len(self.heap) and self.heap[left_child_node_index] > self.heap[max_index]:
                max_index = left_child_node_index
            if right_child_node_index < len(self.heap) and self.heap[right_child_node_index] > self.heap[max_index]:
                max_index = right_child_node_index
            if max_index == index:
                break

            self.heap[index], self.heap[max_index] = self.heap[max_index], self.heap[index]
            index = max_index
        return top

n = int(sys.stdin.readline().rstrip())
heap = MaxHeap()
for _ in range(n):
    x = int(sys.stdin.readline().rstrip())
    if x > 0:
        heap.insert(x)
    elif x == 0:
        print(heap.delete())
