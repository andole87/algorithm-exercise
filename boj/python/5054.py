t = int(input())
while t > 0:
    n = int(input())
    p = list(map(int, input().split()))
    mx,mn = max(p),min(p)
    mid = (mx - mn)//2
    print((mx-mid)*2 + (mid - mn)*2)
    t -= 1