def solution(N, stages):
    d = dict()
    for x in range(1,N+2):
        d[x] = 0
    for x in stages:
        d[x] += 1
    total = 0
    for key in sorted(d.keys(),reverse=True):
        total += d[key]
        if total == 0:
            d[key] = 0
        else :
            d[key] = d[key] / total


    return [x for x in sorted(d, key=d.get,reverse=True) if x < N + 1]



N = 4
stages = [4,4,4,4,4]
print(solution(N, stages))
