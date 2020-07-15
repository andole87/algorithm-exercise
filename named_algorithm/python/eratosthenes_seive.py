def getPrimeList(end_int):
    a = [False, False] + [True]*(end_int - 1)
    primes = []

    for i in range(2, end_int+1):
        if a[i]:
            primes.append(i)
            for j in range(2*i, end_int+1, i):
                a[j] = False
    return primes

a = int(input())

print(getPrimeList(a))
