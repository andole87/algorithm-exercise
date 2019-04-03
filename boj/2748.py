fibo_list = [0,1]
for i in range(int(input())-1):
    fibo_list.append(fibo_list[-1] + fibo_list[-2])

print(fibo_list[-1])