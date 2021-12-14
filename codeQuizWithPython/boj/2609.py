# 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
#
# 첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
#
# 첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.

import sys

a, b = map(int, sys.stdin.readline().rstrip().split())

tmp_a = a
tmp_b = b
while tmp_b != 0:
    tmp_a, tmp_b = tmp_b, tmp_a%tmp_b

print(tmp_a)
print(int(a*b/tmp_a))