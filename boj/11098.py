t = int(input())
while t > 0:
    p = 0
    n = ''
    for _ in range(int(input())):
        st = input().split()
        price = int(st[0])
        name = st[1]
        if price > p:
            p = price
            n = name

    print(n)
    t -= 1


