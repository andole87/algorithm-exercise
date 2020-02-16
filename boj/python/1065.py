n = int(input())
count = 0
for i in range(1, n+1):
    if i < 100:
        count = i
    elif i>=100 and i<1000:
        s = str(i)
        if int(s[0]) - int(s[1]) == int(s[1]) - int(s[2]):
            count += 1
    else:
        break

print(count)
