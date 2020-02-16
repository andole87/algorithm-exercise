def get_sec(a):
    return a[0]*3600 + a[1]*60 + a[2]
def get_time(a):
    result = []
    result.append(a//3600)
    a = a % 3600
    result.append(a//60)
    a = a % 60
    result.append(a)
    return result

def get_format(a):
    result = []
    if a[0] > 23:
        a[0] -= 24
    for x in a:
        if len(str(x)) == 1:
            result.append("0"+str(x))
        else:
            result.append(str(x))
    return result


a = list(map(int,input().split(":")))
b = list(map(int,input().split(":")))
rs = []

b[0] = b[0] + 24
x,y = get_sec(a),get_sec(b)
print(":".join(get_format(get_time(y-x))))
