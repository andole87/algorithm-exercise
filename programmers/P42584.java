import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P42584 {
    @Test
    void name() {
        Solution s = new Solution();
        int[] prices = new int[]{1, 2, 3, 2, 3};
        System.out.println(Arrays.toString(s.solution(prices)));
    }

    static class Solution {
        public int[] solution(int[] prices) {
            int[] answer = new int[prices.length];

            for (int i = 0; i < prices.length - 1; i++) {
                int target = prices[i];
                int count = 1;
                for (int j = i + 1; j < prices.length - 1; j++) {
                    int current = prices[j];
                    if (current < target) {
                        break;
                    } else {
                        count++;
                    }
                }
                answer[i] = count;
            }
            return answer;
        }
    }
}
