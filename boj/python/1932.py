import sys
input = sys.stdin.readline

n = int(input())
numbers = []
m = 0
for _ in range(n):
    numbers.append(list(map(int,input().split())))

for i in range(1, n):
    for j in range(0, len(numbers[i])):
        if j == 0:
            numbers[i][j] = numbers[i-1][j] + numbers[i][j]
        elif len(numbers[i])-1 == j:
            numbers[i][j] = numbers[i-1][j-1] + numbers[i][j]
        else:
            numbers[i][j] = max(numbers[i-1][j], numbers[i-1][j-1]) + numbers[i][j]

print(max(numbers[n-1]))