a = list(map(int,input().split()))
b = sorted(a)

if a == b:
    print("ascending")
elif a == list(reversed(b)):
    print("descending")
else:
    print("mixed")