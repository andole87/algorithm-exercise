result = []
for _ in range(int(input())):
    st = input().split()
    name = st[0]
    if len(st[2]) != 2:
        st[2] = "0" + st[2]
    if len(st[1]) != 2:
        st[1] = "0" + st[1]

    d = int(st[3] + st[2] + st[1])
    result.append([d, name])
result.sort()
print(result[-1][1])
print(result[0][1])