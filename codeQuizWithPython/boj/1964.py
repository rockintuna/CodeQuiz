# 오각형의 각 변에 아래 그림과 같이 점을 찍어 나간다. N단계에서 점의 개수는 모두 몇 개일까?
# 첫째 줄에 N(1 ≤ N ≤ 10,000,000)이 주어진다.
# 첫째 줄에 N단계에서 점의 개수를 45678로 나눈 나머지를 출력한다.
import sys

number = int(sys.stdin.readline().rstrip())

result = 5
for i in range(number):
    if i > 0:
        plus = 7 + 3 * (i-1)
        result += plus
    else:
        continue

print(result%45678)