stack = []
for _ in range(int(input())):
    b = input().strip()
    a = b.split()
    s = len(stack)
    if b == "top":
        if s != 0:
            print(stack[-1])
        else:
            print("-1")
    elif b == "size":
        print(s)
    elif b == "pop":
        if s !=0:
            print(stack.pop())
        else:
            print("-1")
    elif b == "empty":
        if s == 0:
            print(1)
        else:
            print(0)

    if a[0] == "push":
        stack.append(a[1])
