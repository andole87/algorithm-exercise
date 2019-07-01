import sys
input = sys.stdin.readline

n, k = map(int, input().split())
coins = []
for _ in range(n):
    coins.append(int(input()))

memo = [0] * (k + 1)
for i in range(1, k + 1):
    v = 10000
    for coin in coins:
        if i >= coin and v > memo[i - coin]:
            v = memo[i - coin]
    memo[i] = v + 1
if memo[k] != 10001:
    print(memo[k])
else:
    print(-1)