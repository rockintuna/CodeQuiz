def get_expression_list_and_sign_list(expression):
    sign_set = set()
    calc_list = []
    num = 0
    for char in expression:
        if char.isnumeric():
            num = num * 10 + int(char)
        else:
            calc_list.append(num)
            calc_list.append(char)
            sign_set.add(char)
            num = 0
    calc_list.append(num)

    return calc_list, list(sign_set)


def get_loop_count(list):
    length = len(list)
    if length == 3:
        return 6
    elif length == 2:
        return 2
    elif length == 1:
        return 1


def calc(sign, num1, num2):
    if sign == '-':
        return num1 - num2
    elif sign == '+':
        return num1 + num2
    else:
        return num1 * num2


def change_order(i, sign_list):
    if i > 0 and i % 2 == 0:
        sign_list[0], sign_list[2] = sign_list[2], sign_list[0]
    elif i % 2 == 1:
        sign_list[0], sign_list[1] = sign_list[1], sign_list[0]


def solution(expression):
    calc_list, sign_list = get_expression_list_and_sign_list(expression)

    result = 0
    for i in range(get_loop_count(sign_list)):
        change_order(i, sign_list)

        temp_list = calc_list.copy()
        for sign in sign_list:
            index = 1
            while sign in temp_list:
                if index < len(temp_list)-1 and temp_list[index] == sign:
                    temp_list[index] = calc(sign, temp_list[index-1], temp_list[index+1])
                    del temp_list[index+1]
                    del temp_list[index-1]
                else:
                    index += 1

        result = max(result, abs(temp_list[0]))

    return result


print(solution("50*6-3*2"))
