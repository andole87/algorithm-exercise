package heap;

import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;
import java.util.Queue;

public class P42626 {
    @Test
    void name() {
        int[] sco = new int[]{9, 10, 12};
        Solution s = new Solution();
        System.out.println(s.solution(sco, 7));
    }

    static class Solution {
        public int solution(int[] sco, int K) {
            int answer = 0;
            Queue<Integer> q = new PriorityQueue<>();
            for (int s : sco) {
                q.offer(s);
            }
            boolean flag = false;
            while (q.size() > 1) {
                int p1 = q.poll();
                int p2 = q.poll();
                if (p1 >= K) {
                    flag = true;
                    break;
                }
                q.offer(p1 + 2 * p2);
                answer++;
            }

            if (flag) {
                return answer;
            } else {
                if (!q.isEmpty() && q.peek() > K) {
                    return answer;
                }
                return -1;
            }
        }
    }
}
