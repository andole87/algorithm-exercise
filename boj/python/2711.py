t = int(input())
while t > 0:
    result = ""
    a,b = input().split()
    for i in range(len(b)):
        if int(a)-1 == i:
            continue
        result += b[i]
    print(result)
    t -= 1