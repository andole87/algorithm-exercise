# 정점은 N, 간선은 V
N, V = 0, 0
# 인접리스트
graph_adj_list = [[] for _ in range(N + 1)]

def bfs(start):
    visited = []
    discovered = [0] * (N + 1)
    queue = [start]
    while queue:
        next = queue.pop()
        visited.append(next)
        for i in graph_adj_list[next]:
            if not discovered[i]:
                discovered[i]  = 1
                queue = [i] + queue
    return visited