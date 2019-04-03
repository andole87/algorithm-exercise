temp = input().split(' ')
a = [int(temp[0]),int(temp[1])]
temp = input().split(' ')
b = [int(temp[0]),int(temp[1])]
temp = input().split(' ')
c = [int(temp[0]),int(temp[1])]


location = sorted([a,b,c])
result = []
if location[0][0] == location[1][0]:
    result.append(location[2][0])
    if location[0][1] == location[2][1]:
        result.append(location[1][1])
    else:
        result.append(location[0][1])
else:
    result.append(location[0][0])
    if location[0][1] == location[1][1]:
        result.append(location[2][1])
    else:
        result.append(location[1][1])

print(str(result[0]) + " " + str(result[1]))
