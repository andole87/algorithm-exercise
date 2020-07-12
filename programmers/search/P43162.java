package search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P43162 {
    @Test
    void name() {
        Solution s = new Solution();
        int[][] c = new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
//        int[][] c = new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        System.out.println(s.solution(3, c));
    }

    class Solution {
        public int solution(int n, int[][] computers) {
            int answer = 0;
            List<Integer>[] adj = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    if (i != j && computers[i][j] == 1) {
                        adj[i].add(j);
                    }
                }
            }
            boolean[] visited = new boolean[n];

            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    Queue<Integer> q = new LinkedList<>();
                    q.add(i);
                    visited[i] = true;
                    while (!q.isEmpty()) {
                        int curr = q.poll();
                        for (int j = 0; j < adj[curr].size(); j++) {
                            int next = adj[curr].get(j);
                            if (!visited[next]) {
                                visited[next] = true;
                                q.add(next);
                            }
                        }
                    }
                    answer++;
                }
            }
            return answer;
        }
    }
}
