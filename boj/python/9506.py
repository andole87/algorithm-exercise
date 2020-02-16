def get_factor_list(n):
    result = [1,]
    for i in range(2, n//2 + 1):
        if n % i == 0:
            result.append(i)
    return sorted(result)

def print_factor(n,li):
    temp = str(n) + " = " + str(li[0])
    for i in range(1,len(li)):
        temp = temp + " + " + str(li[i])
    print(temp)

while True:
    a = int(input())
    if a == -1:
        exit()

    factors = get_factor_list(a)
    if sum(factors) == a:
        print_factor(a,factors)
    else:
        print(a,"is NOT perfect.")
