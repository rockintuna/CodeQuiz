import sys

n = int(sys.stdin.readline().rstrip())
k = int(sys.stdin.readline().rstrip())

result = []
list = list(range(1, n+1))

for i in range(1, n+1):
    [result.append(j * i) for j in list]