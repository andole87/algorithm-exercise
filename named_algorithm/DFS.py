# 정점은 N, 간선은 V
N, V = 0, 0
# 인접행렬 방식
graph_adj_list = [[0 for _ in range(N + 1)] for _ in range(N + 1)]
# 정점에 방문했는지 여부를 기록
visited = [0 for _ in range(N + 1)]

# 재귀호출
def dfs(node):
    print("DFS visits " + node + "\n")
    visited[node] = 1
    for i in range(len(graph_adj_list[node])):
        there = graph_adj_list[node][i]
        if not visited[there]:
            dfs(there)


for i in range(len(graph_adj_list)):
    if not visited[i]:
        dfs(i)