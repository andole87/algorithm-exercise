t = int(input())
result = 0
for _ in range(t):
    word = input()
    temp = set(word[0])
    flag = True
    for i in range(1,len(word)):
        if word[i] != word[i-1] and word[i] in temp:
            flag = False
            break
        temp.add(word[i])
    if flag:
        result += 1
print(result)