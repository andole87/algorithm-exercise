package heap;

import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;
import java.util.Queue;

public class P46292 {
    @Test
    void name() {
        Solution s = new Solution();
        int[] dates = new int[]{4, 10, 15};
        int[] supplies = new int[]{20, 5, 10};
        System.out.println(s.solution(4, dates, supplies, 30));
    }

    static class Solution {
        public int solution(int stock, int[] dates, int[] supplies, int k) {
            int answer = 0;
            Queue<Integer> q = new PriorityQueue<>((a, b) -> (b - a));
            int index = 0;
            while (stock < k) {
                while (index < dates.length && dates[index] <= stock) {
                    q.offer(supplies[index]);
                    index++;
                }
                stock += q.poll();
                answer++;
            }
            return answer;
        }
    }
}
