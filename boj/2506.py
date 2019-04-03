n = int(input())
scores = list(map(int,input().split()))
score = 0
add = 0

for x in scores:
    if x == 1:
        add += 1
        score += add
    else:
        add = 0
print(score)

