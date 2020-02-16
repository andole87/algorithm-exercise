t = int(input())
count = 1

while count <= t:
    c = input().split(' ')
    a = int(c[0])
    b = int(c[1])
    st = str(a) + " + " + str(b) + " = " + str(a+b)
    print("Case #" + str(count) +": " + st)
    count += 1