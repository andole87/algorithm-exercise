def solution(n):
    answer = 0
    tokens = set(str(n))

    for x in tokens:
        if x == '0':
            continue

        if n % int(x) == 0:
            answer += 1
    return answer

print(solution(2322))
