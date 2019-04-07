alphabets = [chr(x) for x in range(97,123)]
str = input()
result = []
for x in alphabets:
    if x in str:
        result.append(str.index(x))
    else:
        result.append(-1)

print(*result,sep=" ")