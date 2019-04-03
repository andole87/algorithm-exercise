def one(n,b):
    i = b-(int(n/3) + 1)
    temp = " "*(3*i-1)
    temp+="*"
    temp+= " "*(3*i-1)
    print(temp)

def two(n):
    i = int(n / 3) + 1
    temp = " " * (3*i -2) + ""
    pass

def three(n):
    a = int(n / 3)
    pass

N = int(input())
b = int(N/3)

for i in range(1,24,3):
    one(i,b)
