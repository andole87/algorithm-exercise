h,m = map(int,input().split())
result = h*60 + m - 45

hh = result // 60
mm = result % 60

if hh < 0:
    hh = 23
if mm == 0:
    mm = "00"
print(hh,mm, sep=" ")