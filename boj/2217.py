import sys

n = int(input())
rope = list(map(int, sys.stdin.readlines()))
rope.sort(reverse=True)
m = 0
for i, x in enumerate(rope):
    w = x * (i+1)
    if w > m:
        m = w
print(m)
