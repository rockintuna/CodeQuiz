# 1 <= m <= 1439
# "CC#BCC#BCC#BCC#B"
# musicinfos <= 100
# ['12:00,12:14,HELLO,C#DEFGAB', '13:00,13:05,WORLD,ABCDEF']

from datetime import datetime


def solution(m, musicinfos):
    replace_code_sharp = {'C#': 'c', 'D#': 'd', 'F#': 'f', 'G#': 'g', 'A#': 'a'}

    max_length = 0
    result = 'None'

    for mucisinfo in musicinfos:
        data = mucisinfo.split(',')
        data[1].split(',')
        start = datetime.strptime(data[0], '%H:%M')
        end = datetime.strptime(data[1], '%H:%M')
        interval = end - start
        seconds = interval.seconds // 60

        code = data[3]
        for origin in replace_code_sharp.keys():
            code = code.replace(origin, replace_code_sharp.get(origin))
            m = m.replace(origin, replace_code_sharp.get(origin))

        if len(code) > seconds:
            code = code[0:seconds]
        elif len(code) < seconds:
            rep = seconds // len(code)
            remains = seconds % len(code)
            code = code * rep + code[0:remains]

        if code.__contains__(m):
            if len(code) > max_length:
                max_length = len(code)
                result = data[2]

    return result
start = datetime.strptime('00:00', '%H:%M')
end = datetime.strptime('03:00', '%H:%M')
print((end-start).seconds//60)

print(solution("ABCDEFG", ["12:00,00:00,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"]))
print(solution("CC#BCC#BCC#BCC#B", ["03:00,03:30,FOO1,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B", "04:00,04:30,FOO,CC#B"]))
print(solution("CC#BCC#BCC#BCC#B", ["03:00,03:30,FOO,CCB", "04:00,04:08,BAR,CC#BCC#BCC#B"]))
print(solution("ABC", ["12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"]))