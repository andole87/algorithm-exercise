a = int(input())
b = int(input())
adj = [[] for _ in range(a + 1)]
for _ in range(b):
    x,y = map(int,input().split())
    adj[x].append(y)
    adj[y].append(x)

visited = []
stack = [1]
while stack:
    next = stack.pop()
    if not next in visited:
        visited.append(next)
        stack += adj[next]

print(len(visited)-1)