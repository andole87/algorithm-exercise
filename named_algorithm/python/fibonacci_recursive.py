## 0번째 피보나치수는 0, 1번재 피보나치수는 1..
## DP말고 그냥 재귀호출..
def fibo(n):
    if n == 0:
        return 0
    if n == 1:
        return 1
    return fibo(n-1) + fibo(n-2)