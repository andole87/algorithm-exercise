step = []
m = int(input())
for _ in range(m):
    step.append(int(input()))
d1 = dict()
d2 = dict()

d1[1] = step[0]
d1[2] = step[1]

d2[1] = step[0]
d2[2] = step[0] + step[1]

flag = False
for i in range(3,m+1):
    if flag:
        d1[i] = d1[i-2] + step[i-1]
        flag = False
    else:
        if d1[i-1] > d1[i-2]:
            d1[i] = d1[i-1] + step[i-1]
            flag = True
        else:
            d1[i] = d1[i-2] + step[i-1]

flag = True
for i in range(3,m+1):
    if flag:
        d2[i] = d2[i - 2] + step[i - 1]
        flag = False
    else:
        if d2[i - 1] > d2[i - 2]:
            d2[i] = d2[i - 1] + step[i - 1]
            flag = True
        else:
            d2[i] = d2[i - 2] + step[i - 1]

print(max(d1[m],d2[m]))