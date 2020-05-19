package queuestack;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P42588 {

    @Test
    void name() {
        Solution s = new Solution();
        int[] heights = new int[]{1, 5, 3, 6, 7, 6, 5};
        System.out.println(Arrays.toString(s.solution(heights)));
    }

    static class Solution {
        public int[] solution(int[] heights) {
            int[] answer = new int[heights.length];
            for (int i = heights.length - 1; i >= 0; i--) {
                int t = heights[i];
                boolean flag = false;
                for (int j = 1; i - j >= 0; j++) {
                    if (t < heights[i - j]) {
                        flag = true;
                        answer[i] = i - j + 1;
                        break;
                    }
                }
                if (!flag) {
                    answer[i] = 0;
                }
            }
            return answer;
        }
    }
}
