
t = input().split(' ')
a,b,c = map(int,t)
scores = []
scores.append(a)
scores.append(b)
scores.append(c)
scores.sort()

if scores[0] == scores[2]:
    print((10000 + scores[0]*1000))
elif scores[0] == scores[1]:
    print((1000+scores[0]*100))
elif scores[1] == scores[2]:
    print((1000+scores[1]*100))
else:
    print(scores[2]*100)




