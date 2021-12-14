numbers = [1, 1, 1, 1, 1]
target_number = 3
count = 0

def get_count_of_ways_to_target_by_doing_plus_or_minus(array, target):
    length = len(array)
    if length == 1:
        if array[0] == abs(target):
            global count
            count += 1
        else:
            return
    else:
        get_count_of_ways_to_target_by_doing_plus_or_minus(array[1:length], target-array[0])
        get_count_of_ways_to_target_by_doing_plus_or_minus(array[1:length], target+array[0])

get_count_of_ways_to_target_by_doing_plus_or_minus(numbers, target_number)
print(count)  # 5를 반환해야 합니다!