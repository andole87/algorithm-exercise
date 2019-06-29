import sys
input = sys.stdin.readline

a,b = map(int, input().split())

sd = dict()
id = dict()

for i in range(a):
    z = input()
    id[i+1] = z
    sd[z] = i+1

for i in range(b):
    c = input()
    try:
        print(id[int(c)],end='')
    except:
        print(sd[c])