citations =[0,1,3,5,6]
answer = 0
citations.sort()

c = len(citations)-1
while True:
    if citations[c] == c + 1:
        answer = c + 1
        break
    elif citations[c] < c + 1:
        answer = c
        break
    else:
        c -= 1
print(answer)