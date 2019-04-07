t = int(input())
while t > 0:
    b = [x for x in list(map(int,input().split())) if x % 2 == 0]
    print(sum(b), min(b), sep=" ")
    t -= 1