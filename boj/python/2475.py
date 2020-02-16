a,b,c,d,e = map(int, input().split())
result = [a,b,c,d,e]
sum = 0
for num in result:
    sum += num**2
print(sum%10)
