import itertools as it
nan = []
for _ in range(9):
    nan.append(int(input()))

for x in it.combinations(nan,7):
    if sum(x) == 100:
        print(*sorted(x), sep="\n")
        break