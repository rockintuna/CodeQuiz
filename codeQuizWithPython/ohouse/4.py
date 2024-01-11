def solution(isAvailable, N, M, H, W):
    table = [[0 for col in range(M)] for row in range(N)]
    for i in range(len(isAvailable)):
        j = 0
        for point in isAvailable[i]:
            table[i][j] = int(point)
            j += 1

    count = 0
    for row in range(N):
        for col in range(M):
            if rightStanding(table, row, col, H, W):
                count += 1

    return count


def rightStanding(table, a, b, H, W):
    col = a
    row = b
    for i in range(H):
        if row < 0 or table[row][col] == 0:
            return False
        row -= 1
    for i in range(W):
        if col < len(table[0]):
            if table[row][col] == 0:
                return False
        else:
            return False
        col += 1
    for i in range(H):
        if row > len(table):
            if table[row][col] == 0:
                return False
        else:
            return False
        row += 1
    return True


solution(["1111", "1011", "1011", "1111"], 4, 4, 2, 3)
