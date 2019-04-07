t = int(input())
while t > 0:
    a = list(map(int,input().split()))
    a.remove(min(a))
    a.remove(max(a))
    if (max(a) - min(a)) >= 4:
        print("KIN")
    else:
        print(sum(a))
    t -= 1