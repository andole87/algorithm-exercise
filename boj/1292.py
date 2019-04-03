table = []
for i in range(1,1001):
    for j in range(i):
        table.append(i)

a,b = map(int,input().split())
sum = 0
for i in range(a-1,b):
    sum += table[i]
print(sum)