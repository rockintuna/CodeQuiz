import sys

n = int(sys.stdin.readline().rstrip())

for i in range(n):
    div_sum = i
    temp = i
    while temp > 10:
        div_sum += temp%10
        temp = temp//10
    div_sum += temp

    if div_sum == n:
        print(i)
        exit()

print(0)