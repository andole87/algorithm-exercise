def get_money(arr,x):
    for i in range(len(arr)):
        if x >= arr[i]:
            return arr[i]

n,k = map(int,input().split())
money = []
for i in range(n):
    money.append(int(input()))
money = sorted(money,reverse=True)
a = 0
while True:
    if k == 0:
        break
    m = get_money(money,k)
    a += k // m
    k = k % m
print(a)
