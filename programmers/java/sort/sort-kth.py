def solution(array, commands):
    answer = []
    for command in commands:
        sliced= array[command[0]-1:command[1]-1]
        result = sorted(sliced)[command[2]-1]
        answer.append(result)

    return answer