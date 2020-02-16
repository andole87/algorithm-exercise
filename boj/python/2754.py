grade = input()
a = grade[0]
if a == "F":
    print("0.0")
    exit()
b = grade[1]
score = 0
if a == "A":
    score +=4
elif a == "B":
    score +=3
elif a == "C":
    score +=2
elif a == "D":
    score += 1

if b == "+":
    score += 0.3
elif b == "0":
    score += 0.0
elif b == "-":
    score -= 0.3

print(score)

