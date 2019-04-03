def cut_score(n):
    if n < 40:
        return 40
    else:
        return n

scores = []
for i in range(5):
    scores.append(int(input()))

avg = list(map(cut_score,scores))

print(int(sum(avg)/5))


