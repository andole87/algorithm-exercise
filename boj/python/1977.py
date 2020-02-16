import math

a = int(input())
b = int(input())
a, b = math.ceil(math.sqrt(a)), math.floor(math.sqrt(b))
sum, _min = 0, 0
for i in range(a, b+1):
    sum += i ** 2
if sum == 0:
    print(-1)
    exit()
_min = a ** 2

print(sum)
print(_min)
