result = []
for i in range(10):
    result.append(int(input()) % 42)

a =  set(result)
print(len(a))