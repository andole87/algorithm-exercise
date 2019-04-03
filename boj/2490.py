result = ["E","A","B","C","D"]
for _ in range(3):
    yut = list(map(int,input().split()))
    judge = 0
    for i in yut:
        if i == 0:
            judge += 1
    print(result[judge])
