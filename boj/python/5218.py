def get_number(a,b):
    a,b = ord(a),ord(b)
    if a > b:
        return 26 + b - a
    else:
        return b - a

t = int(input())
for _ in range(t):
    a,b = input().split()
    dis = "Distances: "
    res = []
    for i in range(len(a)):
        res.append(str(get_number(a[i],b[i])))
    print(dis + " ".join(res))