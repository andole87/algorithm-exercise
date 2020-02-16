n = int(input())
r = [0] * n
g = [0] * n
b = [0] * n
for i in range(n):
    x, y, z = map(int, input().split())
    if i == 0:
        r[0] = x
        g[0] = y
        b[0] = z
    else:
        r[i] = min(g[i - 1], b[i - 1]) + x
        g[i] = min(r[i - 1], b[i - 1]) + y
        b[i] = min(r[i - 1], g[i - 1]) + z

print(min(r[-1], g[-1], b[-1]))
