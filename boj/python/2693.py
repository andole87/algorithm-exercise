t = int(input())
while t > 0:
    a = list(map(int,input().split()))
    print(sorted(a,reverse=True)[2])
    t-=1

