n = int(input())
count = 1
while count <= n:
    i = input().split(' ')
    a = int(i[0])
    b = int(i[1])
    sum = a + b
    print("Case #" + str(count) + ": " + str(sum))
    count += 1
