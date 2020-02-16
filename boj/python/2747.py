fibo = [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597]

n = int(input())

while n >= len(fibo):
    for i in range(17, n):
        fibo.append(fibo[i]+fibo[i-1])

print(fibo[n])