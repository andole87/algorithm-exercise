t = int(input())
while t > 0:
    result = []
    for i in range(int(input())):
        test = input().split()
        a, b = test[0], int(test[1])
        result.append([b, a])

    result.sort()
    print(result[-1][1])
    t -= 1
