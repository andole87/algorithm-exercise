k = int(input())
for i in range(k):
    scores = list(map(int, input().split()))
    del scores[0]
    sscores = sorted(scores, reverse=True)
    gap = 0
    for j in range(1, len(sscores)):
        if sscores[j-1] - sscores[j] > gap:
            gap = sscores[j-1] - sscores[j]
    print("Class {}".format(i+1))
    print("Max {}, Min {}, Largest gap {}".format(max(sscores),min(sscores),gap))