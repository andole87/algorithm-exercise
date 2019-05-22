from collections import defaultdict
import sys
input = sys.stdin.readline
n = int(input())
if n == 1:
    print(input())
    exit()
a = defaultdict(lambda: 0)
for _ in range(n):
    a[input()] += 1
for _ in range(n-1):
    t = input()
    if a[t] == 1:
        del a[t]
    else:
        a[t] -= 1

print(list(a.keys())[0])
