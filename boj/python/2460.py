count = 0
max = 0
for _ in range(10):
    a,b = map(int,input().split())
    count += b-a
    if max < count:
        max = count

print(max)
