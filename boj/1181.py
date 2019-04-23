a = []
t = int(input())
for _ in range(t):
    a.append(input())
b = sorted(set(a), key=lambda x: str(len(x)).zfill(2) + x)
print("\n".join(b))