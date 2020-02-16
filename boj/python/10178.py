t = int(input())
while t > 0:
    a,b = map(int ,input().split())
    print("You get {} piece(s) and your dad gets {} piece(s).".format(a//b,a%b))
    t -= 1