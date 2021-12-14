# 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
# 명령은 총 여섯 가지이다.
# push X: 정수 X를 큐에 넣는 연산이다.
# pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
# size: 큐에 들어있는 정수의 개수를 출력한다.
# empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
# front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
# back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
#
# 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 2,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
# 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
#
# 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
import sys
from collections import deque

number = int(sys.stdin.readline().rstrip())


class Queue:
    def __init__(self):
        self.queue = deque()

    def push(self, value):
        self.queue.append(value)

    def pop(self):
        if self.is_empty() == 1:
            return -1
        else:
            return self.queue.popleft()

    def front(self):
        if self.is_empty() == 1:
            return -1
        else:
            return self.queue[0]

    def back(self):
        if self.is_empty() == 1:
            return -1
        else:
            return self.queue[len(self.queue) - 1]

    def size(self):
        return len(self.queue)

    def is_empty(self):
        if len(self.queue) == 0:
            return 1
        else:
            return 0


queue = Queue()


def command(string):
    if string.__contains__('push'):
        num = string.split(' ')[1]
        queue.push(num)
    elif string == 'pop':
        print(queue.pop())
    elif string == 'size':
        print(queue.size())
    elif string == 'empty':
        print(queue.is_empty())
    elif string == 'front':
        print(queue.front())
    elif string == 'back':
        print(queue.back())
    else:
        print("Invalid command")


for _ in range(number):
    string = sys.stdin.readline().rstrip()
    command(string)
