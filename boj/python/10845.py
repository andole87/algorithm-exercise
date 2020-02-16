queue = []
for _ in range(int(input())):
    b = input()
    a = b.split()
    if b == "back":
        try:
            print(queue[-1])
        except:
            print("-1")
    if b == "front":
        try:
            print(queue[0])
        except:
            print("-1")
    elif b == "size":
        print(len(queue))
    elif b == "pop":
        try:
            print(queue.pop(0))
        except:
            print("-1")
    elif b == "empty":
        if not queue:
            print(1)
        else:
            print(0)

    if a[0] == "push":
        queue.append(int(a[1]))
