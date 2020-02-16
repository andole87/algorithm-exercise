sum = 0
max = 0
for _ in range(4):
    a,b = map(int,input().split())
    sum -= a
    sum += b
    if sum > max:
        max = sum

print(max)