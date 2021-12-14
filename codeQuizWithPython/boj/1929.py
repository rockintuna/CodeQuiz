# M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
# 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
# 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
import math
import sys

m, n = map(int, sys.stdin.readline().rstrip().split())

def is_prime(num):
    for i in range(math.trunc(math.sqrt(num))+1):
        if i < 2:
            continue
        elif num % i == 0:
            return False
    return True


def get_prime_list(num1, num2):
    result = []
    for num in range(num1, num2 + 1):
        if num == 1:
            continue
        if is_prime(num):
            result.append(num)
    return result


prime_list = get_prime_list(m, n)
for prime in prime_list:
    print(prime)