def dec2bin(decimal):
    answer = []
    remainder = 0

    while True:
        remainder = decimal % 2
        answer.append(remainder)
        decimal = decimal // 2

        if decimal == 0:
            break

    return answer


t = int(input())

while t > 0:
    result = []
    bins = dec2bin(int(input()))
    for i in range(len(bins)):
        if bins[i]:
            result.append(i)

    print(" ".join(list(map(str, bins))))
