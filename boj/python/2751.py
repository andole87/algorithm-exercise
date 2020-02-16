import sys
input = sys.stdin.readline

n = int(input())
print("\n".join(map(str,sorted(list(map(int,sys.stdin.read().splitlines()))))))