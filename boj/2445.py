t = int(input())
for i in range(1, t+1):
    print("*"*i + " " *2*(t-i) + "*"*i)
for i in range(1, t)[::-1]:
    print("*"*i + " " *2*(t-i) + "*"*i)
