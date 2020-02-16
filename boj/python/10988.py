s = input()

for i in range(1,len(s)//2+1):
    if not s[i-1] == s[-i]:
        print("0")
        exit()

print("1")
