def solution(progresses, speeds):
    answer = []
    while progresses:
        for i in range(len(progresses)):
            progresses[i] += speeds[i]

        if progresses[0] >= 100:
            temp = []
            for i,v in enumerate(progresses):
                if v >= 100:
                    temp.append(i)
            answer.append(len(temp))
            for x in reversed(temp):
                del progresses[x]
                del speeds[x]

    return answer

progress, speeds = 	[40, 93, 30, 55, 60, 65], [60, 1, 30, 5 , 10, 7]
print(solution(progress,speeds))
progress, speeds = [93, 30, 55, 60, 40, 65], [1, 30, 5 , 10, 60, 7]
print(solution(progress,speeds))