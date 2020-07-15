# 정점은 N, 간선은 V
N, V = 0, 0
# 인접리스트
graph_adj_list = [[] for _ in range(N + 1)]

# 재귀호출
def dfs_recursive(node, visited):
    print("DFS visits " + node + "\n")
    visited[node] = 1
    for i in range(len(graph_adj_list[node])):
        there = graph_adj_list[node][i]
        if not visited[there]:
            dfs_recursive(there, visited)


def dfsAll():
    visited = [0 for _ in range(N + 1)]
    for i in range(len(graph_adj_list)):
        if not visited[i]:
            dfs_recursive(i, visited)


## 스택
def dfs_stack(start):
    stack = [start]
    visited = []
    while stack:
        next = stack.pop()
        if not next in visited:
            visited.append(next)
            stack += graph_adj_list[next]
    return visited
