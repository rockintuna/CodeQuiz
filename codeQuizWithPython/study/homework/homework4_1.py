import heapq

def get_minimum_count_of_overseas_supply(stock, dates, supplies, k):
    max_heap = []

    index = 0
    count = 0
    while stock < k:
        while index < len(dates) and dates[index] <= stock:
            heapq.heappush(max_heap, supplies[index] * -1)
            index += 1

        stock += heapq.heappop(max_heap) * -1
        count += 1
    return count

print("정답 = 2 / 현재 풀이 값 = ", get_minimum_count_of_overseas_supply(4, [4, 10, 15], [20, 5, 10], 30))
print("정답 = 4 / 현재 풀이 값 = ", get_minimum_count_of_overseas_supply(4, [4, 10, 15, 20], [20, 5, 10, 5], 40))
print("정답 = 1 / 현재 풀이 값 = ", get_minimum_count_of_overseas_supply(2, [1, 10], [10, 100], 11))
print("정답 = 3 / 현재 풀이 값 = ", get_minimum_count_of_overseas_supply(2, [1, 7, 28], [5, 22, 2], 30))