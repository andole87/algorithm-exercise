def solution(input):
    open = ['[', '{', '(']
    close = [']', '}', ')']
    stack = []
    for x in input:
        if x in open:
            if len(stack) == 0:
                stack.append(x)
            elif open.index(stack[len(stack) -1]) >= open.index(x):
                return False
            else:
                stack.append(x)
        if x in close:
            if open.index(stack.pop()) != close.index(x):
                return False
    answer = True
    return answer


print(solution('3+{(5+1}'))
