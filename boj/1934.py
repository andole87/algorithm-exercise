def get_list(n):
    result = set()
    result.add(1)
    result.add(n)
    for i in range(2, int(n/2)+1):
        if n % i == 0:
            result.add(i)
    return result


t = int(input())
while t > 0:
    temp = input().split(' ')
    a = int(temp[0])
    b = int(temp[1])

    alist = get_list(a)
    blist = get_list(b)
    result = alist & blist

    print( int(a * b / max(result)))
    t -= 1