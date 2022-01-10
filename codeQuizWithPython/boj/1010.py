import sys

t = int(sys.stdin.readline().rstrip())

def solution(n, m):
    a = 1
    b = 1
    while n > 0:
        a = a * m
        b = b * n
        n = n - 1
        m = m - 1
    return a//b

for _ in range(t):
    n, m = map(int, sys.stdin.readline().rstrip().split())
    print(solution(n,m))

