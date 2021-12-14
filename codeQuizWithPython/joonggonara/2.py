from collections import deque


def solution(v):
    v.sort()
    answer = v[len(v) // 2]
    v.remove(answer)
    queue = deque(v)
    print(v)

    for index in range(len(v)):
        if index % 2 == 0:
            if index == len(v)-1:
                answer -= queue.pop()
            else:
                answer -= queue.popleft()*2
        else:
            if index == len(v)-1:
                answer += queue.pop()
            else:
                answer += queue.pop()*2
    print(queue)
    return answer

print(solution([1,4,6,6,10]))