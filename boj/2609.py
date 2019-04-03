def get_lcm(a,b):
    reminder = 0
    while b!=0:
        reminder = a % b
        a = b
        b = reminder
    return a

a,b = map(int, input().split())
lcm = get_lcm(a,b)
gcd = a * b // lcm
print(lcm)
print(gcd)