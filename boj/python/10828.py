stack = []
for _ in range(int(input())):
    b = input()
    a = b.split()
    if b == "top":
        try:
            print(stack[-1])
        except:
            print("-1")
    elif b == "size":
        print(len(stack))
    elif b == "pop":
        try:
            print(stack.pop())
        except:
            print("-1")
    elif b == "empty":
        if not stack:
            print(1)
        else:
            print(0)

    if a[0] == "push":
        stack.append(int(a[1]))
