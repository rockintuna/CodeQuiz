# 조규현과 백승환은 터렛에 근무하는 직원이다. 하지만 워낙 존재감이 없어서 인구수는 차지하지 않는다. 다음은 조규현과 백승환의 사진이다.
# 이석원은 조규현과 백승환에게 상대편 마린(류재명)의 위치를 계산하라는 명령을 내렸다. 조규현과 백승환은 각각 자신의 터렛 위치에서 현재 적까지의 거리를 계산했다.
# 조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고, 조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때, 류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오.
#
# 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 다음과 같이 이루어져 있다.
# 한 줄에 x1, y1, r1, x2, y2, r2가 주어진다. x1, y1, x2, y2는 -10,000보다 크거나 같고, 10,000보다 작거나 같은 정수이고, r1, r2는 10,000보다 작거나 같은 자연수이다.
#
# 각 테스트 케이스마다 류재명이 있을 수 있는 위치의 수를 출력한다. 만약 류재명이 있을 수 있는 위치의 개수가 무한대일 경우에는 -1을 출력한다.
import math
import sys


class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y


number = int(sys.stdin.readline().rstrip())


def distance_between(point1, point2):
    return math.sqrt((point1.x - point2.x) ** 2 + (point1.y - point2.y) ** 2)


data_list = []
for _ in range(number):
    data_list.append(list(map(int, sys.stdin.readline().rstrip().split())))

for data in data_list:
    x1 = data[0]
    y1 = data[1]
    r1 = data[2]
    x2 = data[3]
    y2 = data[4]
    r2 = data[5]
    point1 = Point(x1, y1)
    point2 = Point(x2, y2)
    distance = distance_between(point1, point2)

    if distance == 0 and r1 == r2:
        print(-1)
    elif max(r1, r2) > distance and distance < abs(r1 - r2):
        print(0)
    elif max(r1, r2) > distance == abs(r1 - r2):
        print(1)
    elif distance == r1 + r2:
        print(1)
    elif distance > r1 + r2:
        print(0)
    else:
        print(2)