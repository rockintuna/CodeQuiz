import sys

size = int(sys.stdin.readline().rstrip())
num_list = list(map(int, sys.stdin.readline().rstrip().split()))

num_list.sort()
print(num_list[-1]*num_list[0])

