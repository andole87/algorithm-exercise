w = []
k = []
for _ in range(10):
    w.append(int(input()))
for _ in range(10):
    k.append(int(input()))

ws = sorted(w,reverse=True)
ks = sorted(k,reverse=True)
print(sum(ws[:3]),sum(ks[:3]),sep=" ")