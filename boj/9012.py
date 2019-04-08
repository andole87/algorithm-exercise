def check(str):
    if len(str) == 0:
        return True

    if "()" in str:
        return check(str.replace("()",""))
    else:
        return False
        
    


t = int(input())
while t > 0:
    a = input()
    if check(a):
        print("YES")
    else:
        print("NO")
    t -= 1
