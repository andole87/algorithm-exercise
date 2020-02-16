step = []
t = int(input())
for _ in range(t):
    step.append(int(input()))

dp = [0] * t
dp[0] = step[0]
dp[1] = step[0] + step[1]
for i in range(2,t):
    dp[i] = max(dp[i-2]+step[i], dp[i-3]+step[i]+step[i-1])
print(dp[-1])