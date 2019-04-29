def get_ichin(num):
    if num == 1 or num == 2:
        return 1
    dp = [0]*(num+1)
    dp[1] = 1
    dp[2] = 1
    for i in range(3, num+1):
        dp[i] = dp[i-2] + dp[i-1]
    return dp[-1]


n = int(input())
print(get_ichin(n))

