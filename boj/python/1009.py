import sys

input = sys.stdin.readline


def cal(a, b):
    if a == 1:
        return 1
    if a == 2:
        b = b % 4
        return [2, 4, 8, 6][b - 1]
    if a == 3:
        b = b % 4
        return [3, 9, 7, 1][b - 1]
    if a == 4:
        b = b % 2
        return [4, 6][b - 1]
    if a == 5:
        return 5
    if a == 6:
        return 6
    if a == 7:
        b = b % 4
        return [7,9,3,1][b-1]
    if a == 8:
        b = b % 4
        return [8,4,2,6][b-1]
    if a == 9:
        b = b % 2
        return [9,1][b-1]
    if a == 0:
        return 10

t = int(input())
for i in range(t):
    a, b = input().split()
    print(cal(int(a[-1]), int(b)))
