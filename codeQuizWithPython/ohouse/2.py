def solution(n):
    sieve = [True] * (n//2 + 1)

    m = int((n//2 + 1) ** 0.5)
    for i in range(2, m + 1):
        if sieve[i] == True:
            for j in range(i+i, n//2 + 1, i):
                sieve[j] = False

    list = [i for i in range(2, n//2 + 1) if sieve[i] == True]

    for i in range(len(list)-1):
        if list[i] > n ** 0.5:
            break
        num = 0
        index = i
        while index < len(list)-1 and num < n:
            index += 1
            num = list[i] * list[index]
        if num == n:
            return [list[i], list[index]]

    return [-1,-1]


print(solution(99999999))