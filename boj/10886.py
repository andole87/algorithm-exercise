n = int(input())
result = {"0":0,"1":0}
for i in range(n):
    result[input()] +=1

if result["0"] > result["1"]:
    print("Junhee is not cute!")
else:
    print("Junhee is cute!")
