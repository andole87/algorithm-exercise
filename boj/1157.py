a = input().lower()
if len(a) == 1:
    print(a.upper())
    exit()
max = dict()
for x in a:
    if not x in max:
        max[x] = len(a) - len(a.replace(x,""))

m = sorted(max.values(),reverse=True)
if m[0] == m[1]:
    print("?")
else:
    alphabet = ""
    count = 0
    for x in max.keys():
        if max[x] > count:
            count = max[x]
            alphabet = x.upper()
    print(alphabet)
