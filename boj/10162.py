def get_count(t):
    result = {"a":0,"b":0,"c":0}
    if t % 10 != 0:
        return result
    while t >= 10:
        if t >= 300:
            result["a"] += t//300
            t = t % 300
        elif 300>t>=60:
            result["b"] += t//60
            t = t%60
        else:
            result["c"] +=t//10
            break
    return result

t = int(input())
res = get_count(t)
a,b,c = res.values()
if (a+b+c) == 0:
    print(-1)
    exit()

print(a,b,c)
