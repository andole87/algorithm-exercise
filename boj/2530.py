def rem_hh(hh):
    if hh>=24:
        hh-=24
        return rem_hh(hh)
    else:
        return int(hh)

t = input().split(' ')
h = int(t[0])
m = int(t[1])
s = int(t[2])
c = int(input())

result = h*3600 + m*60 + s + c

temp = int(result / 60)
hh = int(temp / 60)
mm = temp % 60
ss = result % 60

hh = rem_hh(hh)

print(str(hh) + " " + str(mm) + " " + str(ss))


