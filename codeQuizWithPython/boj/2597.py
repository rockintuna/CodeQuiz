# 계단은 한 번에 한 계단씩 또는 두 계단씩 오를 수 있다. 즉, 한 계단을 밟으면서 이어서 다음 계단이나, 다음 다음 계단으로 오를 수 있다.
# 연속된 세 개의 계단을 모두 밟아서는 안 된다. 단, 시작점은 계단에 포함되지 않는다.
# 마지막 도착 계단은 반드시 밟아야 한다.
# 각 계단에 쓰여 있는 점수가 주어질 때 이 게임에서 얻을 수 있는 총 점수의 최댓값을 구하는 프로그램을 작성하시오.
#
# 입력의 첫째 줄에 계단의 개수가 주어진다.
# 둘째 줄부터 한 줄에 하나씩 제일 아래에 놓인 계단부터 순서대로 각 계단에 쓰여 있는 점수가 주어진다.
# 계단의 개수는 300이하의 자연수이고, 계단에 쓰여 있는 점수는 10,000이하의 자연수이다.
#
# 첫째 줄에 계단 오르기 게임에서 얻을 수 있는 총 점수의 최댓값을 출력한다.

import sys

number = int(sys.stdin.readline().rstrip())

score_list = []
max_list = []
for _ in range(number):
    score_list.append(int(sys.stdin.readline().rstrip()))

for i in range(len(score_list)):
    # memorize
    if i == 0:
        max_list.append(score_list[0])
    elif i == 1:
        max_list.append(score_list[1] + score_list[0])
    elif i == 2:
        max_list.append(max(score_list[2] + score_list[0], score_list[2] + score_list[1]))
    else:
        max_list.append(score_list[i] + max(score_list[i-1] + max_list[i-3], max_list[i-2]))

print(max_list[-1])