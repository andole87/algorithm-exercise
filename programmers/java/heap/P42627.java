package heap;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class P42627 {
    @Test
    void name() {
        Solution s = new Solution();
        int[][] jobs = new int[][]{{0, 3}, {1, 9}, {2, 6}};
        s.solution(jobs);
    }

    static class Solution {
        public int solution(int[][] jobs) {
            Arrays.sort(jobs);
            int count = 0;
            int index = 0;
            int sum = 0;
            Queue<Req> q = new PriorityQueue<>(Comparator.comparingInt(Req::getDuration));
            while (index < jobs.length || !q.isEmpty()) {
                for (int i = index; i < jobs.length; i++) {
                    if (jobs[i][0] == count) {
                        q.offer(new Req(count, count + jobs[i][1]));
                        index++;
                        break;
                    } else if (jobs[i][0] > count) {
                        break;
                    }
                }
                if (q.peek().getEnd() == count) {
                    sum += q.poll().getDuration();
                }
                count++;
            }
            return sum / jobs.length;
        }
    }

    static class Req {
        private int start;
        private int end;

        public Req(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getDuration() {
            return this.end - this.start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }
    }
}
