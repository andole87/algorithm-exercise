t = input().split(' ')
h = int(t[0])
m = int(t[1])
c = int(input())
time = h * 60 + m
result = time + c

hh = int(result / 60)
if hh >= 24:
    hh -= 24

mm = result % 60

print(str(hh) + " " + str(mm))

