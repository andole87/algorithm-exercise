# def bin(t,l):
#     if len(l) == 0:
#         return 0
#     if len(l) == 1 and t != l[0]:
#         return 0
#     v = len(l)//2
#
#     if t == l[v]:
#         return 1
#     elif t < l[v]:
#         return bin(t,l[0:v])
#     else:
#         return bin(t,l[v:])
#
#
#
# n = int(input())
# a = sorted(list(map(int,input().split())))
# m = int(input())
# b = list(map(int,input().split()))
#
# for x in b:
#     print(bin(x,a))

n = int(input())
a = set(map(int, input().split()))
m = int(input())
b = list(map(int, input().split()))

for x in b:
    c = len(a)
    a.add(x)
    if c == len(a):
        print(1)
    else:
        print(0)