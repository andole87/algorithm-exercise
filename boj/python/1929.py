def prime(m):
    base = [1] *(m+1)
    for i in range(2,m//2):
        if base[i]:
            for j in range(2*i,m+1,i):
                base[j] = 0
    return [ x for x in range(2,m+1) if base[x]]


a,b = map(int, input().split())

print("\n".join([ str(x) for x in prime(b) if x >= a]))
