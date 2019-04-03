t = int(input())
while t > 0:
    price = int(input())
    o = int(input())
    for _ in range(o):
        a, b = map(int, input().split())
        price += a * b
    print(price)
    t -= 1