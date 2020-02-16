
n = int(input())
if n == 1:
    pass
elif 1< n < 4:
    print(n)
else:
    for i in range(2,n+1):
        while True:
            if n == 1:
                break
            elif n % i == 0:
                print(i)
                n = int(n/i)
            else:
                break