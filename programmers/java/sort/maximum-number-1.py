def insertSort(x):
    for i in range(len(x)):
        val = x[i]
        while i > 0 and compareStr(x[i-1],val):
            x[i] = x[i-1]
            i -= 1
        x[i] = val
    return x

def compareStr(x,y):
    length = len(x) if len(x) > len(y) else len(y)
    for i in range(length):
        try:
            a = int(x[i])
        except:
            a = a
        try:
            b = int(y[i])
        except:
            b = b
        if a > b:
            return False
        elif a < b:
            return True
        else:
            continue

numbers = [3, 30, 34, 5, 9]
answer = ''
numbers = list(map(str,numbers))
for x in insertSort(numbers):
    answer += x
print(answer)






