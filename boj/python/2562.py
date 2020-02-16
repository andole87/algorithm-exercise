result = [0,0]
for i in range(9):
    a = int(input())
    if result[0] < a :
        result[0] = a
        result[1] = i+1

print(result[0])
print(result[1])