t = int(input())
while t > 0:
    c = int(input())
    s = 0
    cc = 0
    for _ in range(c):
        a, b = map(float, input().split())
        a = int(a)
        cc += a
        s += (a * b)
    print(cc,round(s / cc, 1))
    t -= 1
