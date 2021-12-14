def merge_sort(array):
    if len(array) <= 1:
        return array
    mid = (0 + len(array)) // 2
    left_array = merge_sort(array[:mid]) # 왼쪽 부분을 정렬하고
    right_array = merge_sort(array[mid:]) # 오른쪽 부분을 정렬한 다음에
    return merge(left_array, right_array) # 합치면서 정렬하면 됩니다!


def merge(array1, array2):
    result = []
    array1_index = 0
    array2_index = 0

    while array1_index < len(array1) and array2_index < len(array2):
        if array1[array1_index] <= array2[array2_index]:
            result.append(array1[array1_index])
            array1_index += 1
        else:
            result.append(array2[array2_index])
            array2_index += 1

    if array1_index == len(array1):
        for i in range(array2_index, len(array2)):
            result.append(array2[i])
    else:
        for i in range(array1_index, len(array1)):
            result.append(array1[i])

    return result


print("정답 = [-7, -1, 5, 6, 9, 10, 11, 40] / 현재 풀이 값 = ", merge_sort([6, 5, 9, 40, -1, -7, 11, 10]))
print("정답 = [-1, 2, 3, 5, 10, 40, 78, 100] / 현재 풀이 값 = ", merge_sort([-1, 10, 3, 100, 40, 2, 78, 5]))
print("정답 = [-1, -1, 0, 1, 6, 9, 10] / 현재 풀이 값 = ", merge_sort([-1, 6, 0, 10, -1, 9, 1]))