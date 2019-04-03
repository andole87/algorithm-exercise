t = input().split()
a = t[0]
b = t[1]
aa = ''
bb = ''
for i in range(3)[::-1]:
    aa += a[i]
    bb += b[i]

if int(aa) > int(bb):
    print(aa)
else:
    print(bb)

