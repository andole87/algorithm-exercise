import sys
input = sys.stdin.readline

def bul(n):
    i = 0
    a = 1
    while True:
        a += i * 6
        if n <= a:
            return i
        i += 1
print(bul(int(input()))+1)