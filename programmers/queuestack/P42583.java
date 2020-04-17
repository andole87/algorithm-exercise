package queuestack;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P42583 {
    @Test
    void name() {
        Solution s = new Solution();
        int[] weights = new int[]{7, 4, 5, 6};
        System.out.println(s.solution(2, 10, weights));
    }

    static class Solution {
        public int solution(int bridge_length, int weight, int[] truck_weights) {
            List<Integer> complete = new ArrayList<>();
            Queue<Integer> bridge = new LinkedList<>();
            int max = 0;
            int answer = 0;
            int index = 0;
            while (complete.size() < truck_weights.length) {
                answer++;
                int truck = truck_weights[index];
                if (!bridge.isEmpty() && complete.contains(answer)) {
                    max -= bridge.poll();
                }
                if (max + truck <= weight) {
                    bridge.add(truck);
                    complete.add(answer + bridge_length);
                    max += truck;
                    index++;
                }
            }
            return answer + bridge_length;
        }
    }
}
