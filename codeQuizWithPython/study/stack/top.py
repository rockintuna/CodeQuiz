top_heights = [6, 9, 5, 7, 4]


 #
 #
 # #
## #
#####
#####
#####
#####
#####

def get_receiver_top_orders(heights):
    length = len(heights)
    result = [0] * length

    for i in range(length - 1):
        target = heights.pop()
        for j in range(len(heights)):
            if heights[len(heights) - 1 - j] >= target:
                result[length - 1 - i] = len(heights) - j
                break
    return result


print(get_receiver_top_orders(top_heights))  # [0, 0, 2, 2, 4] 가 반환되어야 한다!