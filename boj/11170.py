t = int(input())
for _ in range(t):
    a,b = map(int,input().split())
    count = 0
    for i in range(a,b+1):
        temp = str(i)
        y = temp.replace("0","")
        count += len(temp) - len(y)
    print(count)