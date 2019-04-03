score = int(input())
grades = ["A","B","C","D","F"]

edited_score = 9 - int(score / 10)

if edited_score == -1:
    print(grades[0])
elif edited_score > 4:
    print(grades[4])
else:
    print(grades[edited_score])