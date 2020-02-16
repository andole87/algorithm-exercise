def prime():
    n = 123456 * 2
    number = [1] * (n + 1)
    for i in range(2, n // 2):
        if number[i]:
            for j in range(2 * i, n + 1, i):
                number[j] = 0
    return number


s = prime()
while True:
    a = int(input())
    if a == 0:
        break
    print(len([x for x in range(a + 1, (a * 2) + 1) if s[x] == 1]))
