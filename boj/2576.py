odd = []
for i in range(7):
    ip = input()
    if ip[-1] in ['0','2','4','6','8']:
        continue
    else:
        odd.append(int(ip))

if len(odd) == 0:
    print(-1)
else:
    print(sum(odd))
    print(min(odd))
