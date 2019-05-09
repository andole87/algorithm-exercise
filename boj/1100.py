count = 0
a = []
for _ in range(8):
    a.append(input()+"a")
a = [x for sublist in a for x in sublist]
for x in a[::2]:
    if x == "F":
        count += 1

print(count)