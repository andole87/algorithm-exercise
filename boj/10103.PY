a, b = 100, 100

t = int(input())

while t > 0:
    s, c = map(int, input().split())
    if s > c:
        b -= s
    elif s < c:
        a -= c
    t -= 1

print(a)
print(b)
