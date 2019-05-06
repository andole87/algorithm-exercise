def solution(skill, skill_trees):
    answer = 0
    for x in skill_trees:
        edited = ""
        for y in x:
            if y in skill:
               edited += y
        if edited == "":
            answer += 1
            continue
        if edited in skill and edited[0] == skill[0]:
            answer += 1

    return answer

s, st = "ABCDEFGHIJKLMNOPQRSTUVWXYZ", ["AB","ABC","AC"]
print(solution(s,st))