import math

x = int(input())
temp = i = 0

while temp + i< x:
    temp += i
    i += 1

if i % 2 == 0:
    a,b = 1, i
    for j in range(x-temp-1):
        a += 1
        b -= 1

else:
    a,b = i, 1
    for j in range(x-temp-1):
        a -= 1
        b += 1

print(str(a) + "/" + str(b))
