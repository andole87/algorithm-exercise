n, c = map(int, input().split())
f = [0] * (c + 1)
s = set()
for _ in range(n):
    s.add(int(input()))

for x in s:
    for i in range(x, c + 1)[::x]:
        if not f[i]:
            f[i] = 1


print(sum(f))

