# 1 <= moves.len <= 1000
# 1 <= move <= N

def solution(board, moves):
    stack = []
    count = 0

    for move in moves:
        for i in range(len(board[0])):
            peek = board[i][move - 1]
            if peek == 0:
                continue
            else:
                if stack[-1] == peek:
                    stack.pop()
                    count += 2
                stack.append(peek)
                board[i][move - 1] = 0
                break
    answer = 0
    return answer

print(solution([[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]], [1,5,3,5,1,2,1,4]))