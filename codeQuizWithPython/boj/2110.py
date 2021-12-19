import sys

n, c = map(int, sys.stdin.readline().rstrip().split())
houses = []
for _ in range(n):
    houses.append(int(sys.stdin.readline().rstrip()))

houses.sort()
upper_bound = houses[-1] - houses[0] + 1
lower_bound = 1

while upper_bound > lower_bound:
    length = (upper_bound + lower_bound) // 2
    count = 1
    current_index = 0
    for i in range(1, len(houses)):
        if houses[i] - houses[current_index] >= length:
            count += 1
            current_index = i
        else:
            continue

    if count >= c:
        lower_bound = length + 1
    elif count < c:
        upper_bound = length

print(upper_bound-1)
