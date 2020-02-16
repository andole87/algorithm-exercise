def solution(bridge_length, weight, truck_weights):
    answer = 0
    c = 0
    s = 0
    while len(truck_weights) != 0:
        b = 0
        add = - 1
        while (b + truck_weights[0]) <= weight:
            w = truck_weights.pop(0)
            b += w
            add += 1
            if len(truck_weights) == 0:
                break
        answer += add
        s += 1

    answer = answer + s * bridge_length

    return answer + 1

# def solution2(b,w,t):
#     answer = 1
#     r,c = [],[]
#     while len(t) != 0 and sum(r) <= w:



b = 12
c = 10
d = [7,4,4,4,7]

r = solution(b,c,d)
print(r)

