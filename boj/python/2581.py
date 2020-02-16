import math

def get_primes(num):
    primes = []
    for i in range(1,num+1):
        isPrime = True
        for p in primes:
            if i % p == 0:
                isPrime = False
                break
        if isPrime and i != 1:
            primes.append(i)
    return primes


m = int(input())
n = int(input())
primes_m = set(get_primes(m-1))
primes_n = set(get_primes(n))
result = primes_n - primes_m
if len(result) == 0:
    print(-1)
else:
    print(sum(result))
    print(min(result))

def eratos(num):
    result = [True for _ in range(num+1)]
    for i in range(2, math.ceil(math.sqrt(num))):
        if result[i]:
            for j in range(i*2, num+1, i):
                result[j] = False
    return result




