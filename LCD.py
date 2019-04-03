def get_gcd(a,b):
    while b!=0:
        remainder = a%b
        a = b
        b = remainder
    return a

def short_get_gcd(a,b):
    while b!=0:
        a,b = b, a % b
    return a


def get_lcd(a,b):
    return a*b // get_gcd(a,b)