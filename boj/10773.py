k = int(input())
r = []
for i in range(k):
    a = int(input())
    if a == 0:
        del r[-1]
    else:
        r.append(a)
print(sum(r)) 