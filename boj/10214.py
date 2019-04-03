t = int(input())

while t > 0:
    a_list = []
    b_list = []
    for _ in range(9):
        a, b = map(int, input().split())
        a_list.append(a)
        b_list.append(b)
    if sum(a_list) > sum(b_list):
        print("Yonsei")
    elif sum(a_list) > sum(b_list):
        print("Korea")
    else:
        print("Draw")
    a_list.clear()
    b_list.clear()
    t -= 1
