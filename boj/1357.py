def rev(x):
    x = str(x)
    ans = ""
    for i in range(len(x))[::-1]:
        ans += x[i]
    return int(ans)

x,y = map(int,input().split())
print(rev(rev(x) + rev(y)))
