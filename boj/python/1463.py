d = dict()
d[1] = 0
n = int(input())
for i in range(2, n + 1):
    indexes = [d[i-1],]
    if i % 2 == 0:
        indexes.append(d[i//2])
    if i % 3 == 0:
        indexes.append(d[i//3])

    d[i] = min(indexes) + 1

print(d[n])