t = int(input())
while t > 0:
    a = input().split(' ')
    number = float(a[0])

    for i in range(1,len(a)):
        if a[i] == "@":
            number *= 3
        elif a[i] == "#":
            number -= 7
        elif a[i] == "%":
            number +=5

    print(format(number,"0.2f"))

    t-=1