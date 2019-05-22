import sys
input = sys.stdin.readline


dp = [ [ 1 for x in range(15)] for y in range(15)]
dp[0] = ([x for x in range(15)])

for i in range(1, 15):
    for j in range(1, 15):
        if j == 1:
            dp[i][j] = 1
        else:
            dp[i][j] = dp[i][j-1] + dp[i-1][j]

t = int(input())
for _ in range(t):
    a = int(input())
    b = int(input())
    print(dp[a][b])