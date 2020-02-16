n = int(input())
a = list(map(int, input().split()))
result = []
flag = False
for i in range(n - 1):
    if a[i] < a[i + 1]:
        if flag:
            continue
        else:
            result.append(a[i])
            flag = True
    else:
        if flag:
            result[-1] -= a[i]
            flag = False
if not result:
    print(0)
    exit()
else:
    if a[-1] > result[-1] and flag:
        result[-1] -= a[-1]
    print(abs(sorted(result)[0]))
