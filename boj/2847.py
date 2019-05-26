import sys
input = sys.stdin.readline

t = int(input())
a = []
for _ in range(t):
    a.append(int(input()))
count = 0

for i in range(len(a))[::-1]:
    if i == len(a)-1:
        continue

    if a[i] >= a[i+1]:
        count += a[i] - a[i+1] + 1
        a[i] = a[i+1] - 1

print(count)
