n = int(input())
for i in range(1,n+1):
    if i != n-1:
        temp = " " * (n-i)
        temp = temp + "*"*(2*i -1) + " "
    else:
        temp = " " * (n-i) + "*"*(2*i-1)
    print(temp)