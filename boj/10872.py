n = int(input())

def get_factorial(num):
    if num == 1 or num == 0:
        return 1
    else:
        return num*get_factorial(num-1)


print(get_factorial(n))