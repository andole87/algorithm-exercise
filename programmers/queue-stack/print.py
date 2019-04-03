def solution(priorities, location):
    answer = 0
    temp = [x for x in range(len(priorities))]
    i = 0
    while len(priorities) != 0:
        m = max(priorities)
        if priorities[0] < m:
            priorities.append(priorities[0])
            del priorities[0]
            temp.append(temp[i])
            del temp[i]
        else:
            del priorities[0]
            i += 1
    return temp.index(location)+1

a = [2,1,2,]
b = 3
c = solution(a,b)
print(c)