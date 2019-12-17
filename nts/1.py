def solution(a, b, budget):
    answer = 0

    for i in range(budget // a + 1):
        tmp = budget - a * i
        if tmp == 0:
            answer += 1
            continue

        if tmp % b == 0:
            answer += 1

    return answer


a, b, c = 100, 100, 100

print(solution(a, b, c))
