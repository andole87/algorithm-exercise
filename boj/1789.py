n = int(input())
sum = 0
i = 1
count = 0

while True:
    if sum > n:
        break
    else:
        sum += i
        i+=1
        count +=1

print(count-1)
