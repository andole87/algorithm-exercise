def get_square(num):
    if num <= 2:
        return num
    result = [1]*(num+1)
    result[2] = 2

    for i in range(3,num+1):
        result[i] = result[i-1] + result[i-2]
    return result[num]

n = int(input())
print(get_square(n)%10007)