a = input()
alpha = ["ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"]
result = 0
for x in a:
    for i,v in enumerate(alpha):
        if x in v:
            result += i + 3

print(result)