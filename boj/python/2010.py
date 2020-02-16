import sys
n = int( sys.stdin.readline().rstrip() )
sum = 0
for i in range(n):
    sum += int( sys.stdin.readline().rstrip() ) - 1
print (sum + 1)
