d0 = dict()
d1 = dict()
d0[0] = 1
d0[1] = 0
d1[0] = 0
d1[1] = 1

def get_result(n):
    a,b = len(d0),len(d1)

    for i in range(a,n+1):
        d0[i] = d0[i-1] + d0[i-2]
        d1[i] = d1[i-1] + d1[i-2]

    return [d0[n],d1[n]]




t = int(input())

for _ in range(t):
    print(" ".join(list(map(str,get_result(int(input()))))))