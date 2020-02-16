k = int(input())
while k > 0:
    a, b = map(int, input().split())
    seats = []
    dup = 0
    for i in range(a):
        w = int(input())
        if b > 0:
            if w in seats:
                dup += 1
            else:
                seats.append(w)
                b -= 1
        else:
            dup += 1
    print(dup)
    k -= 1
