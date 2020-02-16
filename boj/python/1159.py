from collections import defaultdict

data = defaultdict(int)
for _ in range(int(input())):
    data[input()[0]] += 1

sdata = sorted(data.items(), key=lambda v:(v[1]), reverse=True)

if sdata[0][1] < 5:
    print("PREDAJA")
    exit()
result = []
for i in range(len(sdata)):
    if sdata[i][1] < 5:
        break
    result.append(sdata[i][0])
print("".join(sorted(result)))