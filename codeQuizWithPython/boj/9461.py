import sys

cache = [0]*101
cache[1] = 1
cache[2] = 1
cache[3] = 1
cache[4] = 2
cache[5] = 2

def solution(n):
    if n <= 5:
        return cache[n]
    else:
        for i in range(6, n+1):
            cache[i] = cache[i-1] + cache[i-5]
    return cache[n]

t = int(sys.stdin.readline().rstrip())

for _ in range(t):
    n = int(sys.stdin.readline().rstrip())
    print(solution(n))