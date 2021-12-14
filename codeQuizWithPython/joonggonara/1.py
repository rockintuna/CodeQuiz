def solution(votes):
    table = {}

    for vote in votes:
        if vote in table:
            table[vote] += 1
        else:
            table[vote] = 1

    if 'A' in table.keys():
        a = table['A']
    else:
        a = 0

    if 'B' in table.keys():
        b = table['B']
    else:
        b = 0

    if 'C' in table.keys():
        c = table['C']
    else:
        c = 0

    if c >= len(votes) / 2:
        return 'C'
    elif a > b:
        return 'A'
    elif a < b:
        return 'B'
    else:
        return 'AB'