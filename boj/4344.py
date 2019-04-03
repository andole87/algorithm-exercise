n = int(input())
while n>0:
    score = input().split(" ")
    count = int(score[0])
    score.remove(score[0])
    score = list(map(lambda x: int(x),score))

    avg = sum(score)/count
    student = [x for x in score if x > avg]

    result = round(len(student) / count * 100, 3)

    print(format(result, "2.3f")+"%")
    n -= 1