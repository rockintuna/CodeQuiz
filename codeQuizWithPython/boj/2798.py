import sys

n, m = map(int, sys.stdin.readline().rstrip().split())
cards = list(map(int, sys.stdin.readline().rstrip().split()))

result = 0

for i in range(len(cards)-2):
    for j in range(i+1 , len(cards)-1):
        for k in range(j+1 , len(cards)):
            temp = cards[i] + cards[j] + cards[k]
            if m >= temp > result:
                result = temp

print(result)