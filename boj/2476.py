def get_score(lst):
    lst = sorted(lst)
    if lst[0] == lst[2]:
        return (10000 + lst[0] * 1000)
    elif lst[0] == lst[1]:
        return (1000 + lst[0] * 100)
    elif lst[1] == lst[2]:
        return (1000 + lst[1] * 100)
    else:
        return (lst[2] * 100)

n = int(input())
final = set()
while n > 0:
    t = input().split(' ')
    a,b,c = map(int,t)
    scores = [a,b,c]
    final.add(get_score(scores))
    n -= 1

print(max(final))