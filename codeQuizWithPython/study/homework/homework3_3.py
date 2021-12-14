def get_melon_best_album(genre_array, play_array):
    genre_table = {}
    genre_index_table = {}
    for i in range(len(genre_array)):
        if genre_array[i] not in genre_table:
            genre_table[genre_array[i]] = play_array[i]
            genre_index_table[genre_array[i]] = [[i, play_array[i]]]
        else:
            genre_table[genre_array[i]] += play_array[i]
            genre_index_table[genre_array[i]].append([i, play_array[i]])

    result = []
    for genre, total_count in list(sorted(genre_table.items(), key=lambda item: item[1], reverse=True)):
        count = 0
        for index, cnt in sorted(genre_index_table[genre], key=lambda item: item[1], reverse=True):
           if count < 2:
               result.append(index)
               count += 1
           else:
               break

    return result


print("정답 = [4, 1, 3, 0] / 현재 풀이 값 = ",   get_melon_best_album(["classic", "pop", "classic", "classic", "pop"], [500, 600, 150, 800, 2500]))
print("정답 = [0, 6, 5, 2, 4, 1] / 현재 풀이 값 = ", get_melon_best_album(["hiphop", "classic", "pop", "classic", "classic", "pop", "hiphop"], [2000, 500, 600, 150, 800, 2500, 2000]))