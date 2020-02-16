t = int(input())
a = list(map(int,input().split()))
b = list(map(int,input().split()))

sortb = sorted(b,reverse=True)
a = sorted(a)
s = 0
for i in range(len(a)):
    s += sortb[i] * a[i]
print(s)