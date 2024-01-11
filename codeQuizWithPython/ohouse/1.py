def solution(n, m, points, hands):
    answer = 0
    group_got_point = []
    point_per_player = [0]*n
    point = 0

    for i in range(m):
        n_per_hands = {}
        hands_in_round = hands[i]
        for hand in hands_in_round:
            if hand in n_per_hands.keys():
                n_per_hands[hand] += 1
            else:
                n_per_hands[hand] = 1

        list = sorted(n_per_hands.items(), key=lambda item: item[1])
        print(list)

        if len(list) == 1:
            point += points[i]
        elif len(list) == 2:
            point += points[i]
            if point >= 0:
                winner = winnerBetween(list[0][0], list[1][0])
                for j in range(n):
                    if hands[i][j] == winner:
                        point_per_player[j] += point
            else:
                loser = loserBetween(list[0][0], list[1][0])
                for j in range(n):
                    if hands[i][j] == loser:
                        point_per_player[j] += point
            point = 0
        else:
            point += points[i]
            if list[0][1] == list[1][1]:
                if list[0][1] != list[2][1]:
                    for j in range(n):
                        if hands[i][j] == list[2][0]:
                            point_per_player[j] += point
                    point = 0
            elif list[1][1] == list[2][1]:
                for j in range(n):
                    if hands[i][j] == list[0][0]:
                        point_per_player[j] += point
                point = 0
            else:
                if point >= 0:
                    winner = winnerBetween(list[0][0], list[1][0])
                    for j in range(n):
                        if hands[i][j] == winner:
                            point_per_player[j] += point
                else:
                    loser = loserBetween(list[1][0], list[2][0])
                    for j in range(n):
                        if hands[i][j] == loser:
                            point_per_player[j] += point
                point = 0
    return max(point_per_player)

def winnerBetween(a, b):
    list = []
    list.append(a)
    list.append(b)
    list.sort()
    if list[0] == 'R':
        return 'R'
    else:
        if list[1] == 'R':
            return 'P'
        else:
            return 'S'

def loserBetween(a, b):
    list = []
    list.append(a)
    list.append(b)
    list.sort()
    if list[0] == 'R':
        return 'S'
    else:
        if list[1] == 'R':
            return 'R'
        else:
            return 'P'

print(solution(6, 5, [5, -2, 1, 3, -5], ["PSPRSS", "SSRRSS", "RRRRRR", "RRSSPP", "SSSRRP"]))