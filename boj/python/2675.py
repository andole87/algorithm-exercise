t = int(input())
while t > 0:
    a = input().split(' ')
    i = int(a[0])
    result = ""
    for x in a[1]:
        result += x*i

    print(result)
    t-=1