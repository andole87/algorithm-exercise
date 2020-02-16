t = int(input())
while t > 0:
    score = input()
    point = 0
    result = 0
    for word in score:
        if word == "O":
            point += 1
        else:
            point = 0
        result += point
    print(result)
    t -= 1

