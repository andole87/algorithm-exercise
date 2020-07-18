def solution(numbers):
    string = ''
    isZero = 0
    length = len(numbers)
    for i in range(length):
        if numbers[i] == 0:
            isZero += 1
        numbers[i] = str(numbers[i])
    if isZero == length:
        return '0'

    i = 0
    while i < length - 1:
        if numbers[i] + numbers[i + 1] > numbers[i + 1] + numbers[i]:
            numbers[i], numbers[i + 1] = numbers[i + 1], numbers[i]
            i -= 1
        i += 1
    for i in range(length - 1, -1, -1):
        string += numbers[i]
    return string

number = [20,200,20]
print(solution(number))
