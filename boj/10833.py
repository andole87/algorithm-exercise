t = int(input())
reminder = 0
while t > 0:
    a,b = map(int, input().split())
    reminder += b % a
    t -= 1
print(reminder)
