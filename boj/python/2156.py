n = int(input())
p = []
dp = [0] * (n)
for _ in range(n):
    p.append(int(input()))

if len(p) == 1:
    print(p[0])
    exit()
if len(p) == 2:
    print(sum(p))
    exit()
if len(p) == 3:
    print(max(p[0]+p[1],p[1]+p[2],p[0]+p[2]))
    exit()

dp[0] = p[0]
dp[1] = p[0] + p[1]
dp[2] = max(p[2] + p[1], p[0] + p[1], p[0] + p[2])
for i in range(3, n):
    dp[i] = max(dp[i-2] + p[i], dp[i-3] + p[i-1] + p[i], dp[i-1])


print(max(dp))
