def add_year(a,y):
    if a + 1 > y:
        a = 1
    else:
        a += 1
    return a


e,s,m = map(int,input().split())
x=y=z = 1
i = 1
while x != e or s != y or m != z:
    x = add_year(x,15)
    y = add_year(y,28)
    z = add_year(z,19)
    i += 1

print(i)
