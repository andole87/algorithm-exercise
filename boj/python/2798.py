def blackjack(a, b):
    if b[0] + b[1] + b[2] <= a:
        return b[0] + b[1] + b[2]
    result = []
    for i in range(len(b)):
        for j in range(i+1,len(b)):
            for k in range(j+1,len(b)):
                if a >= b[i] + b[j] + b[k]:
                    result.append(b[i] + b[j] + b[k])
    return max(result)
n,m = map(int,input().split())
c = sorted(list(map(int,input().split())), reverse=True)
print(blackjack(m,c))