import sys
input = sys.stdin.readline

n,m = map(int,input().split())
s = []
for i in range(n):
    if i == 0:
        s.append(list(map(int,input().split())))
        continue
    s.append([s[-1][i] + int(x) for i, x in enumerate(input().split())])

t = int(input())
for _ in range(t):
    a,b,c,d = map(int ,input().split())
    w = 0
    if a == 1:
        for i in range(b-1,d):
            w += s[c-1][i]
        print(w)
    else:
        for i in range(b-1,d):
            w += (s[c-1][i] - s[a-2][i])
        print(w)
