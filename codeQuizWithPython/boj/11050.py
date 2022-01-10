import sys

n, k = map(int, sys.stdin.readline().rstrip().split())

a = 1
b = 1

while k > 0:
    a = a * n
    b = b * k
    n = n - 1
    k = k - 1

print(a//b)