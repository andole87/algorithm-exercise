rd = dict()
rd[1] = 1
rd[2] = 2
rd[3] = 4
rd[4] = 7

def get_dp(n):
    make_dp(n)
    return rd[n]

def make_dp(n):
    a = len(rd)
    if n > a:
        for i in range(a,n+1):
            rd[i] = rd[i-1] + rd[i-2] + rd[i-3]


for _ in range(int(input())):
    print(get_dp(int(input())))