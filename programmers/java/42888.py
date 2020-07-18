def solution(record):
    uids = dict()

    for x in record:
        temp = x.split(" ")
        if temp[0] != "Leave":
            uids[temp[1]] = temp[2]

    result = []
    for x in record:
        temp = x.split(" ")
        if temp[0] == "Enter":
            result.append(uids[temp[1]]+"님이 들어왔습니다.")
        if temp[0] == "Leave":
            result.append(uids[temp[1]]+"님이 나갔습니다.")

    return result

record = ["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]
print(solution(record))




