import sys
input = sys.stdin.readline
n = int(input())

a = [0]*10001
for i in range(n):
    index = int(input())
    a[index] +=1

for i in range(1,10001):
    print("%s\n" % i*a[i],end="")