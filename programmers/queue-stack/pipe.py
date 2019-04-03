arrangement = arrangement.replace("()", ' ').strip()
answer = 0
steel = 0
for tag in arrangement:
        if tag == '(':
            steel += 1
        elif tag == ')':

        else:
            steel = [s+1 for s in steel]
    return answer
