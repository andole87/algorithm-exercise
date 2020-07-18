arrangement = arrangement.replace("()", ' ').strip()
answer = 0
arrangement = arrangement.replace("()"," ").strip()
answer = 0
steel = []
for x in arrangement:
    if x == '(':
        steel.append('(')
    elif x == ')':
        steel.pop()
        answer += 1
    else:
        answer += len(steel)
return answer
