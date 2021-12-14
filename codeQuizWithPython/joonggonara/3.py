def solution(n):

    count = n // 5
    remain = n % 5

    if remain == 1:
        if count > 0:
            return count+1
        else:
            return -1
    elif remain == 2:
        if count > 1:
            return count+2
        else:
            return -1
    elif remain == 3:
        return count+1
    elif remain == 4:
        if count > 0:
            return count+2
        else:
            return -1
    else:
        return count