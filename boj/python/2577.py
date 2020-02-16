d = dict()
for i in range(10):
    d[i] = 0

a = int(input())
b = int(input())
c = int(input())
n = str(a * b * c)
for x in n:
    d[int(x)] += 1
for _ in range(10):
    print(d[_])