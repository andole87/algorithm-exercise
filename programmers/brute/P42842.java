package brute;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P42842 {
    @Test
    void name() {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(24, 24)));
        System.out.println(Arrays.toString(s.solution(10, 2)));
        System.out.println(Arrays.toString(s.solution(8, 1)));
        System.out.println(Arrays.toString(s.solution(5000, 2_000_000)));
    }

    class Solution {
        public int[] solution(int brown, int yellow) {
            for (int i = 1; i <= yellow; i++) {
                if (yellow % i == 0) {
                    int a = yellow / i;
                    if (2 * (a + i + 2) == brown) {
                        int[] answer = new int[2];
                        answer[0] = Math.max(a + 2, i + 2);
                        answer[1] = Math.min(a + 2, i + 2);
                        return answer;
                    }
                }
            }
            return new int[]{0, 0};
        }
    }
}
