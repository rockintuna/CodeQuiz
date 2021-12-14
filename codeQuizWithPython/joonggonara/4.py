def solution(K, user_scores):
    table = {}

    count = 0
    for user_score in user_scores:
        user = user_score.split(' ')[0]
        score = user_score.split(' ')[1]

        if user in table.keys():
            if score > table[user]:
                old_score = table[user]
                list = sorted(table.items(), key=lambda item: item[1], reverse=True)
                print(list)
                for ranked_user_score in list[0:K]:
                    ranked_score = ranked_user_score[1]
                    if old_score < ranked_score < score:
                        count += 1
                        print('t1')
                        break
                table[user] = score
        elif len(table) < K:
            table[user] = score
            print('t2')
            count += 1
        else:
            list = sorted(table.items(), key=lambda item: item[1], reverse=True)
            for ranked_user_score in list[0:K]:

                if score > ranked_user_score[1]:
                    table[user] = score

                    count += 1
                    break

    return count

print(solution(3, ["alex111 100", "cheries2 200", "coco 150", "luna 100", "alex111 120", "coco 300", "cheries2 110"]))