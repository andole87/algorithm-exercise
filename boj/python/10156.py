a,b,c = map(int,input().split())
result = a*b - c
if result < 0:
    result = 0
print(result)