scores = []
for _ in range(8):
    scores.append(int(input()))

s = sorted(scores, reverse=True)
sm = sum(s[0:5])
index = []
for i in range(5):
    index.append(scores.index(s[i])+1)

print(sm)
print(" ".join(list(map(str,sorted(index)))))