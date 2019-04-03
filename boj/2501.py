def get_factor(num):
    if num == 1:
        return [1]
    result = [1,]
    for i in range(2, num//2 + 1):
        if num % i == 0:
            result.append(i)

    result.append(num)
    return sorted(result)

a,b = map(int, input().split())
factors = get_factor(a)

try:
    print(factors[b-1])
except:
    print(0)